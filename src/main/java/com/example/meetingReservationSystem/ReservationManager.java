package com.example.meetingReservationSystem;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Data
public class ReservationManager <T extends Meeting> {


    private List<T> listOfMeeting = new ArrayList<>();
    public void addMeeting(T meeting) {
        listOfMeeting.add(meeting);
        listOfMeeting.forEach(System.out::println);
    }

    public void deleteMeeting(T meeting) {
        listOfMeeting.remove(meeting);
    }

    public void findMeetingByDate(LocalDateTime date) {
        listOfMeeting.stream()
                .filter(meeting -> meeting.getDateOfMeeting().equals(date))
                .forEach(System.out::println);
    }
}
