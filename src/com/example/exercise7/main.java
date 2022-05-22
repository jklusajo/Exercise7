package com.example.exercise7;

public class main {
    public static void main(String[] args){
        Task2 a [] = new Task2[2];
        a[0] = new Mammals("Big Man", 4, 5, "Biter");
        a[1] = new Dog("Spike", 4, 6, "Carnivorous", "Hound");

        a[1].getVoice();
    }
}