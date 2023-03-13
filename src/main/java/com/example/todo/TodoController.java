package com.example.todo;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.todo.Todo;
import com.example.todo.TodoService;

@RestController
public class TodoController{
    TodoService todoservice=new TodoService();
    @GetMapping("/todos")
    public ArrayList<Todo> getTodos(){
        return todoservice.getTodos();
    }
    @GetMapping("/todos/{todoId}")
    public Todo getTodoById(@PathVariable("todoId") int id){
        return todoservice.getTodoById(id);
    }
    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo){
        return todoservice.addTodo(todo);
    }
    @PutMapping("/todos/{todoId}")
    public Todo updateTodo(@PathVariable("todoId")int id,@RequestBody Todo todo){
        return todoservice.updateTodo(id,todo);
    }
    @DeleteMapping("/todos/{todoid}")
    public void deleteTodo(@PathVariable("todoId") int id){
        todoservice.deleteTodo(id);
    }
}