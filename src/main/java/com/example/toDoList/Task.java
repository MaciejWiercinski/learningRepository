package com.example.toDoList;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class Task {

    private Status status;
    private Category category;
    private String description;
    private LocalDate date;
    private LocalTime time;



    @ToString
    @AllArgsConstructor
    enum Status {
        created("New task"),
        started("Process task"),
        finished("End task");

        private String action;

    }


    @Getter
    @ToString
    @AllArgsConstructor
    enum Category {
        high("Urgent and important"),
        medium("Urgent, but not important"),
        low("Not urgent and not important");

        private String specification;

    }
}
