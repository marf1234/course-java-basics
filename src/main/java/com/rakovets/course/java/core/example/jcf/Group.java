package com.rakovets.course.java.core.example.jcf;

import com.rakovets.course.java.core.example.oop.classes_and_objects.model.User;
import java.util.LinkedList;
import java.util.List;

public class Group {
    private String name;
    private int age;

    public Group(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        List<User> User = new LinkedList<>();
        System.out.println(User);
    }
}
