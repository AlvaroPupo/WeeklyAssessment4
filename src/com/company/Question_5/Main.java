package com.company.Question_5;

import java.util.Scanner;

public class Main {


         /*
         1. Create a new method in this class.  Make sure to instantiate the main to break out of the static context.
         2. Create a switch statement in this new method that has 4 cases and a default.  This switch should take user input of a string .
         3. Make sure you prompt your user as to what they should enter
         4. Have the default case tell the user to input the correct input you are looking for and use recursion to run the switch again.
         */
         Scanner newScanner = new Scanner(System.in);

         public void newMethod(){

             System.out.println("Welcome, what would you like to do today?\nyou can only type: move/swim/run/fly");

             switch (newScanner.nextLine()){
                 case "move":
                     System.out.println("you are moving!!");
                     break;
                 case "fly":
                     System.out.println("you are flying");
                     break;
                 case "swim":
                     System.out.println("you are swimming");
                     break;
                 case "run":
                     System.out.println("you are running");
                     break;
                 default:
                     System.out.println("enter a valid input!!");
                     newMethod();
             }
             newMethod();
         }

        }




