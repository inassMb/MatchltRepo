/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.theaterapp;

/**
 *
 * @author hp
 */

public class TheaterApp {
    
     public static void main(String[] args) {
        TheaterApp myApp = new TheaterApp();
        try {
            double price = myApp.calculateTiketPrice(1, 20);
            System.out.println("Ticket price: " + price);
        } catch (InvalidTypeException | InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Calculate the ticket price based on seat type and customer's age.
     * @param age The age of the customer.
     * @param type The type of seat (1, 2, 3, or 4).
     * @return The ticket price.
     * @throws InvalidTypeException if the seat type is invalid.
     * @throws InvalidAgeException if the age is negative.
     */
    public double calculateTiketPrice(int age, int type) throws InvalidTypeException, InvalidAgeException {
        if (type < 1 || type > 4) {
            throw new InvalidTypeException("Invalid seat type: " + type);
        }

        if (age < 0) {
            throw new InvalidAgeException("Invalid age: " + age);
        }

        // Calculate ticket price based on age and type
       
        if (type==1) {
            if (age<=3) {
                return 0;
            }else if (age<=11) {
                return 45;
            }else if (age<=59) {
                return 60;
            }else if (age>60) {
                return 30;
            }else return 999;
        }else if (type==2) {
           if (age<=3) {
                return 0;
            }else if (age<=11) {
                return 37.5;
            }else if (age<=59) {
                return 50;
            }else if (age>60) {
                return 25;
            } else return 999;
        }else if (type==3) {
          if (age<=3) {
                return 0;
            }else if (age<=11) {
                return 30;
            }else if (age<=59) {
                return 40;
            }else if (age>60) {
                return 20;
            }  else return 999;
        }else if (type==4){
        if (age<=3) {
                return 0;
            }else if (age<=11) {
                return 22.5;
            }else if (age<=59) {
                return 30;
            }else if (age>60) {
                return 15;
            }else return 999;
        }else return 999;
  
       
     }
    
}
