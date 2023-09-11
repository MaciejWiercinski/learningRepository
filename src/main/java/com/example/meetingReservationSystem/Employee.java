package com.example.meetingReservationSystem;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
public class Employee extends Member {

    private String position;

}
