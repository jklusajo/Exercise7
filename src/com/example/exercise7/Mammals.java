package com.example.exercise7;

public class Mammals extends Task2 {
    private String order;

    public Mammals() {
        super();
        order = "JL";
    }

    public Mammals(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.order = order;
    }

    public Mammals(int age, String order) {
        super(age);
        this.order = order;
    }

    public void drinkMilk(){
        System.out.println("Sip sip");
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal is making sound");
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Mammal is eating " + foodName);
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "order='" + order + '\'' +
                '}';
    }
}