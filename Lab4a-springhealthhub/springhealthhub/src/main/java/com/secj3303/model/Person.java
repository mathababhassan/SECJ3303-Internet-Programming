package com.secj3303.model;

public class Person {

    private String name;
    private int yob;
    private double weight;
    private double height;

    public Person() {
    }

    public Person(String name, int yob, double weight, double height) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return weight / (height * height);
    }

    public String getCategory() {
        double bmi = getBmi();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
}
