package com.example.toDoList;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();
        taskManager.createTask(
                Task.Category.high,
                "pay a rent",
                LocalDate.of(2023, 9, 15),
                LocalTime.of(10, 0));

        taskManager.createTask(
                Task.Category.low,
                "go shopping",
                LocalDate.of(2023, 9, 15),
                LocalTime.of(12, 0));

        taskManager.createTask(
                Task.Category.medium,
                "take out rubbish",
                LocalDate.of(2023, 9, 15),
                LocalTime.of(21, 0));

        taskManager.findTaskByCategory(Task.Category.high);

        taskManager.sortTaskByCategory();

        taskManager.deleteTask(Task.Category.medium,
                "take out rubbish",
                LocalDate.of(2023, 9, 15),
                LocalTime.of(21, 0));

    }
}
