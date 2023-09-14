package com.example.toDoList;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
public class TaskManager {

    private List<Task> listOfTasks = new ArrayList<>();

    public void createTask(Task.Category category, String description, LocalDate date, LocalTime time) {
        Task task = new Task();
        task.setStatus(Task.Status.created);
        task.setCategory(category);
        task.setDescription(description);
        task.setDate(date);
        task.setTime(time);
        listOfTasks.add(task);
        listOfTasks.forEach(System.out::println);
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

    public void editTask() {

    }

    public void deleteTask(Task.Category category, String description, LocalDate date, LocalTime time) {
        listOfTasks.removeIf(task -> task.getCategory().equals(category) &&
                task.getDescription().equals(description) &&
                task.getDate().equals(date) &&
                task.getTime().equals(time));
        listOfTasks.forEach(System.out::println);
    }
}
