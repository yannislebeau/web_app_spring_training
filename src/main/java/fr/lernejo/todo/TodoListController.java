package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

public class TodoListController {


    private final List<Todo> todoList = new ArrayList<>();

    public TodoListController(){

    }

    @PostMapping(path = "api/todo")
    public void add(Todo todo){
        todoList.add(todo);
    }

    @GetMapping(path = "api/todo")
    public List<Todo> getTodoList(){
        return todoList;
    }

}
