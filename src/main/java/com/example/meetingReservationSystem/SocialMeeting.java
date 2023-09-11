package com.example.meetingReservationSystem;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class SocialMeeting extends Meeting {

    private String placeOfMeeting;
}
