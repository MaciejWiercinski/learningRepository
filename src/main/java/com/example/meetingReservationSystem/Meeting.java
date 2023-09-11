package com.example.meetingReservationSystem;

import lombok.Data;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
@Data
public class Meeting {

    private LocalDateTime DateOfMeeting;
    private Duration durationOfMeeting;
    private List<Member> members;

}