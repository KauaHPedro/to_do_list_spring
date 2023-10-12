package br.com.kauapedro.todoList.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="tb_usuarios")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id_usuario")
    private UUID id;
    @Column(name = "apelido", unique = true)
    private String username;
    @Column(name="nome")
    private String name;
    @Column(name="senha")
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    
}
