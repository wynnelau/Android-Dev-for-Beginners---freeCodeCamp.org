package com.example.challenge2;

import java.util.Random;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome!");
        System.out.println("Username: ");
        String name = sc.next();
        System.out.println("Hello, " + name);
        System.out.println("Should we start the game?");
        String reply = sc.next();
        int randint = random.nextInt(20);
        int guess = 0;
        switch(reply){
            case "y":
            case "Y":
                System.out.println("Guess a number: ");
                guess = sc.nextInt();
                break;
            default:
                System.out.println("Game over!");
                System.exit(0);
        }
        for (int i = 0; i < 4; i++){
            if (randint == guess) {
                System.out.println("Congratulations!");
                System.exit(0);
            }
            if (guess < randint) {
                System.out.println("Value should be greater!");
            } else if (guess > randint) {
                System.out.println("Value should be smaller!");
            }
            System.out.println("Guess a number: ");
            guess = sc.nextInt();
        }
        System.out.println("Game over!");
        System.out.print("Value should be ");
        System.out.print(randint);
        System.exit(0);
    }
}
