package com.example.exercise7;

public class Dog extends Mammals{
    private String stock;

    Dog(){
        super();
        stock = "MC";
    }

    public Dog(String name, int age, int weight, String abcd, String stock){
        super(name,age,weight,abcd);
        this.stock = stock;
    }

    public Dog(int age, String abcd, String stock){
        super(age,abcd);
        this.stock = stock;
    }

    public void fetch(){
        System.out.println("The dog is fetching.");
    }

    @Override
    public void drinkMilk() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoice() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eat(String foodName) {
        System.out.println("The dog is eating " + foodName);
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "stock='" + stock + '\'' +
                '}';
    }
}