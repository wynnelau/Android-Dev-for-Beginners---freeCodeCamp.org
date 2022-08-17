package com.example.Challenge;

public class Eye extends Organ{
    private String color;

    public Eye(String name, String medicalCondition, String color) {
        super(name, medicalCondition);
        this.color = color;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
