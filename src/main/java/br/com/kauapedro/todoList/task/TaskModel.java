package br.com.kauapedro.todoList.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "tb_tarefas")
@Data
public class TaskModel {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id_tarefa")
    private UUID id;

    @Column(name = "descricao")
    private String description;
    @Column(name = "titulo", length = 50)
    private String title;
    @Column(name = "inicio")
    private LocalDateTime startAt;
    @Column(name = "fim")
    private LocalDateTime endAt;

    @Column(name = "id_usuario")
    private UUID id_user;

    @CreationTimestamp
    LocalDateTime createdAt; 

    @Enumerated(EnumType.STRING)
    @Column(name = "prioridade")
    private Prioridade prioridade;

    public enum Prioridade {
        BAIXA,
        MEDIA,
        ALTA,
        MAXIMA
    }


}
