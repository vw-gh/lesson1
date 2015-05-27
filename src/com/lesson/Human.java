package com.lesson;


public class Human {

    private String name;
    private int age;
    public static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;
    private static final int MIN_NAME_LENGTH = 3;

    public void setAge(int newAge){
        if (newAge > MIN_AGE && newAge < MAX_AGE){
            age = newAge;
        } else {
            System.out.println("age settings ERROR1!!");
        }
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        if (newName != null && newName.length() > MIN_NAME_LENGTH){
            name = newName;
        }
        }
    }