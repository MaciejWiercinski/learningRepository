package com.example.toDoList;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
public class TaskManager {

    private List<Task> listOfTasks = new ArrayList<>();

    public Task createTask(Task.Category category, String description, LocalDate date, LocalTime time) {
        Task newtask = new Task();
        newtask.setStatus(Task.Status.created);
        newtask.setCategory(category);
        newtask.setDescription(description);
        newtask.setDate(date);
        newtask.setTime(time);
        listOfTasks.add(newtask);
        listOfTasks.forEach(System.out::println);
        return newtask;
    }

    public void findTaskByCategory(Task.Category category) {
        listOfTasks.stream()
                .filter(task -> task.getCategory().equals(category))
                .forEach(System.out::println);
    }

    public void sortTaskByCategory() {
        listOfTasks.stream()
                .sorted(Comparator.comparing(Task::getCategory))
                .forEach(System.out::println);
    }

    public void editStatusOfTask(Task task, Task.Status newStatus) {
       listOfTasks.removeIf(t -> t.equals(task));
       Task updateTask = new Task();
       updateTask.setStatus(newStatus);
       updateTask.setCategory(task.getCategory());
       updateTask.setDescription(task.getDescription());
       updateTask.setDate(task.getDate());
       updateTask.setTime(task.getTime());
       listOfTasks.add(updateTask);
       listOfTasks.forEach(System.out::println);
    }

    public void deleteTask(Task.Category category, String description, LocalDate date, LocalTime time) {
        listOfTasks.removeIf(task -> task.getCategory().equals(category) &&
                task.getDescription().equals(description) &&
                task.getDate().equals(date) &&
                task.getTime().equals(time));
        listOfTasks.forEach(System.out::println);
    }
}
