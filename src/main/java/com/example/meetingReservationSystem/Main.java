package com.example.meetingReservationSystem;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Employee employeeMember1 = new Employee();
        employeeMember1.setPosition("Manager");
        employeeMember1.setName("John");
        employeeMember1.setSurname("Doe");

        Employee employeeMember2 = new Employee();
        employeeMember2.setPosition("Engineer");
        employeeMember2.setName("Jane");
        employeeMember2.setSurname("Smith");

        Friend friendMember1 = new Friend();
        friendMember1.setHobby("Alice");
        friendMember1.setName("Johnson");
        friendMember1.setSurname("Painting");

        Friend friendMember2 = new Friend();
        friendMember2.setHobby("Bob");
        friendMember2.setName("Smith");
        friendMember2.setSurname("Gardening");

        BusinessMeeting businessMeeting1 = new BusinessMeeting();
        businessMeeting1.setDateOfMeeting(LocalDateTime.of(2023, 9, 11, 10, 0,0));
        businessMeeting1.setDurationOfMeeting(Duration.ofMinutes(45));
        businessMeeting1.setMembers(List.of(employeeMember1, employeeMember2));
        businessMeeting1.setTopicOfMeeting("conference");

        SocialMeeting socialMeeting1 = new SocialMeeting();
        socialMeeting1.setDateOfMeeting(LocalDateTime.of(2023,9,16,20,40,0));
        socialMeeting1.setDurationOfMeeting(Duration.ofMinutes(120));
        socialMeeting1.setMembers(List.of(friendMember1, friendMember2));
        socialMeeting1.setPlaceOfMeeting("Old town");

        ReservationManager<Meeting> reservationManager = new ReservationManager<>();
        reservationManager.addMeeting(businessMeeting1);
        reservationManager.findMeetingByDate(LocalDateTime.of(2023, 9, 11, 10, 0,0,0));
        reservationManager.deleteMeeting(businessMeeting1);

        reservationManager.addMeeting(socialMeeting1);
        reservationManager.findMeetingByDate(LocalDateTime.of(2023,9,16,20,40,0));
        reservationManager.deleteMeeting(socialMeeting1);

    }
}
