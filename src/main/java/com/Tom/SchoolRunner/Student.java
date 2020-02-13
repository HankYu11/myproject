package com.Tom.SchoolRunner;

public class Student {
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print(){
        System.out.println(name+"\t"+english+"\t"+math+"\t"+ getPassOrFailed()+"\t" + getGrading()+"\t" + getAverage());
    }

    public int getAverage(){
        return  (english + math)/2;
    }

    public String getPassOrFailed(){
        String passOrFailed = "Failed";
        if(getAverage()>=60){
            passOrFailed = "Pass";
        }
        return  passOrFailed;
    }

    public char getGrading(){
        char grading = 'F';
        switch (getAverage()/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading ='D';
//             default:
        }
        return  grading;
    }
}
