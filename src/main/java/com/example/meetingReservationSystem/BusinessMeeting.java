package com.example.meetingReservationSystem;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class BusinessMeeting extends Meeting {

    private String topicOfMeeting;

}
