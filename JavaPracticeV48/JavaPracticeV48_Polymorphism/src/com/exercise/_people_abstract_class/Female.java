package com.exercise._people_abstract_class;

public class Female  extends Person {
    private static final String CLASS_NAME = "Female";

    public Female(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void printClassName() {
        // TODO Auto-generated method stub
        System.out.println("The person " + name + " belongs to class: " + CLASS_NAME);
    }
    
}
