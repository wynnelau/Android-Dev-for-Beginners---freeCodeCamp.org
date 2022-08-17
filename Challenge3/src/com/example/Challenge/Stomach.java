package com.example.Challenge;

public class Stomach extends Organ{
    private String comments;
    public Stomach(String name, String medicalCondition, String comments) {
        super(name, medicalCondition);
        this.comments = comments;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println(this.comments);
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
