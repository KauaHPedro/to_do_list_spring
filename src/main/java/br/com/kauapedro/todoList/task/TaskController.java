package br.com.kauapedro.todoList.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kauapedro.todoList.task.ITaskRepository;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepository taskRepository;
    
    @PostMapping("/")
    public ResponseEntity createTask (@RequestBody TaskModel taskModel) {
        this.taskRepository.save(taskModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(taskModel); 
    }
}
