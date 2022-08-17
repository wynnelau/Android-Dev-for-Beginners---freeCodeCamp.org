package com.example.Challenge;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Tom", 25,
                new Eye("Left Eye", "Short sighted", "Blue"),
                new Eye("Right Eye", "Normal", "Blue"),
                new Heart("Heart", "Normal", 65),
                new Stomach("Stomach", "PUD", "Need to be fed"),
                new Skin("Skin", "Burned"));
//        Eye leftEye = new Eye("Left Eye", "Short sighted", "Blue");
//        Eye rightEye = new Eye("Right Eye", "Normal", "Blue");
//        Heart heart = new Heart("Heart", "Normal", 65);
//        Stomach stomach = new Stomach("Stomach", "PUD", "Need to be fed");
//        Skin skin = new Skin("Skin", "Burned");
//        System.out.println("Name: Tom");
//        System.out.println("Age: 25");
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        Scanner sc = new Scanner(System.in);
        int organChoice = 0;
        int choice = 0;
        while (organChoice <= 5){
            System.out.println("Choose an Organ: ");
            System.out.println("\t1. Left Eye");
            System.out.println("\t2. Right Eye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stomach");
            System.out.println("\t5. Skin");
            System.out.println("\t6. Quit");
            organChoice = sc.nextInt();
            switch(organChoice){
                case 1:
                    patient.getLeftEye().getDetails();
                    System.out.println("\t1. Close the Eye");
                    choice = sc.nextInt();
                    if (choice == 1) System.out.println("Left Eye Closed");
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    System.out.println("\t1. Close the Eye");
                    choice = sc.nextInt();
                    if (choice == 1) System.out.println("Right Eye Closed");
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t1. Change the heart rate");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println("Enter the new heart rate: ");
                        int newRate = sc.nextInt();
                        patient.getHeart().setHeartRate(newRate);
                        System.out.println("Heart rate changed to: " + patient.getHeart().getHeartRate());
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t1. Digest");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println("Digesting begin...");
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
            }
        }
    }
}
