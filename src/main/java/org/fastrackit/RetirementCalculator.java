package org.fastrackit;

import java.time.LocalDate;
import java.util.Scanner;

public class RetirementCalculator {
    private static LocalDate LocalData;

    public static  void main(String[] args){
      System.out.println(("What is your current age?"));
      Scanner scanner = new Scanner(System.in);
      int age = scanner.nextInt();

      System.out.println("At what age would you like to retire");
      int retirementAge = scanner.nextInt();

      LocalDate currentData = LocalData.now();

      int remainingYears =retirementAge - age;
        System.out.println("You have" + remainingYears +"years left until retirement.");
        System.out.println("It's " + currentData.getYear() +"so you can retire in" + (currentData.getYear() + remainingYears));

    }
}
