package com.example.meetingReservationSystem;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class Friend extends Member {

    private String hobby;
}
