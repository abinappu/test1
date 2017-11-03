package com.example.vizz.university_miniproject;

/**
 * Created by vizz on 3/9/2017.
 */

public class Student {
    private String no;
    private String name;
    private String mobile;
    private String email;
    private String subject;
    private String description;

    public Student(String no, String name, String mobile, String email, String subject, String description) {
        this.no = no;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.subject = subject;
        this.description = description;
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getSubject() {
        return subject;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }
}

