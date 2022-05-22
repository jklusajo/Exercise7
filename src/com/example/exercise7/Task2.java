package com.example.exercise7;

abstract class Task2 {
    private String name;
    private int age;
    private int weight;

    public Task2(){
        age = weight = 0;
        name = "MC";
    }

    public Task2(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Task2(int age){
        this.age = age;
    }

    public abstract void eat(String foodName);
    public abstract void getVoice();

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}