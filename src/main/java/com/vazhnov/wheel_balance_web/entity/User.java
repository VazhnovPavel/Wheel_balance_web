package com.vazhnov.wheel_balance_web.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity( name = "all_user_data")
public class User {
    @Id
    private long chatId; //это наш primary key
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "registered_at")
    private Timestamp registeredAt;
    @Column(name = "time_to_questions")
    private String timeToQuestions;


    public User() {
    }


    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Timestamp registeredAt) {
        this.registeredAt = registeredAt;
    }

    public String getTimeToQuestions() {
        return timeToQuestions;
    }

    public void setTimeToQuestions(String timeToQuestions) {
        this.timeToQuestions = timeToQuestions;
    }





    @Override
    public String toString() {
        return "User{" +
                "chatId=" + chatId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", registeredAt=" + registeredAt +
                ", timeToQuestions=" + timeToQuestions +
                '}';
    }
}
