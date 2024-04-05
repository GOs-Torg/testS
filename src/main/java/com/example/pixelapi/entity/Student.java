package com.example.pixelapi.entity;

public class Student {
   private int id_student;
   private String name;
   private String second_name;
   private String middle_name;
   private int group_id;

    public Student(int id_student, String name, String second_name, String middle_name, int group_id) {
        this.id_student = id_student;
        this.name = name;
        this.second_name = second_name;
        this.middle_name = middle_name;
        this.group_id = group_id;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }
}
