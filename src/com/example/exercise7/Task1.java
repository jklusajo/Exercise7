package com.example.exercise7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    String surnameLusajo56288;
    String nameLusajo56288;
    String streetLusajo56288;
    String zipCodeLusajo56288;
    String cityLusajo56288;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your surname");
        surnameLusajo56288 = br.readLine();
        System.out.println("Enter your first name");
        nameLusajo56288 = br.readLine();
        System.out.println("Enter street");
        streetLusajo56288 = br.readLine();
        System.out.println("Enter your zip code");
        zipCodeLusajo56288 = br.readLine();
        System.out.println("Enter city");
        cityLusajo56288 = br.readLine();

    }

    public void print() {
        System.out.println("-----------------");
        System.out.println("Displaying information");
        System.out.println("       ");
        System.out.println("Surname: " + surnameLusajo56288);
        System.out.println("First name: " + nameLusajo56288);
        System.out.println("Street: " + streetLusajo56288);
        System.out.println("Zip code: " + zipCodeLusajo56288);
        System.out.println("City: " + cityLusajo56288);
    }
}

class Staff extends Task1 {
    String educationLusajo56288;
    String positionLusajo56288;

    public void initialize1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education");
        educationLusajo56288 = br.readLine();
        System.out.println("Enter your position");
        positionLusajo56288 = br.readLine();
    }


    public void print1() {
        print();
        System.out.println("Education: " + educationLusajo56288);
        System.out.println("Position: " + positionLusajo56288);
    }
}

class Main{
    public static void main(String[] args) throws IOException{
        Staff s = new Staff();
        s.initialize1();
        s.print1();
    }
}