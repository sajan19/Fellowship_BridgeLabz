package com.company;

import java.util.Random;

public class useCase1 {
    public static void main(String[] args) {
        System.out.println("Attendance of Employees: ");
        double isPresent;
        isPresent=Math.floor(Math.random()*10)%2;
        System.out.println(isPresent);
        if(isPresent==1){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }

    }
}
