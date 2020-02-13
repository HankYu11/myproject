package com.Tom;

public class Person {
    float weight;
    float height;
    String name;
    public Person(float weight,float height){
        this.weight = weight;
        this.height = height;
    }

//    建構子override
    public Person(String name, float weight, float height){
        this(weight,height); //用this呼叫其他建構子
        this.name = name;
    }

    public float bmi(){
        float bmi = weight/(height*height);
        return  bmi;
    }
    public void hello(){
        System.out.println("Hello World");
    }
}
