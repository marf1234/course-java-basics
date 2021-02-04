package com.rakovets.course.java.core.practice.jcf;

public class Actors {
    private String name;
    private int fee;

    public String getName() {
        return name;
    }

    public int getFee() {
        return fee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Actors{" +
                "name='" + name + '\'' +
                ", fee=" + fee +
                '}';
    }
}
