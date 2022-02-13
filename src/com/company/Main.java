package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void estimation(int x,int y,int z){
        int av = (x+y+z)/3;
        switch (av){
            case(4):
                System.out.println("Your grade is A.");
                break;
            case(3):
                System.out.println("Your grade is B.");
                break;
            case(2):
                System.out.println("Your grade is C.");
                break;
            default:
                System.out.println("Your grade is F.");
        }
    }

    /**
     * Week
     * @param txt1
     */
    public static void weekDay(String txt1){
        switch (txt1) {

            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
        }
    }

    public static void calculator(int r,int t,String u){
        switch (u){
            case "+":
                System.out.println("num1 + num2 = "+(r+t));
                break;
            case "-":
                System.out.println("num1 - num2 = "+(r-t));
                break;
            case "*":
                System.out.println("num1 x num2 = "+(r*t));
                break;
            case "/":
                System.out.println("num1 / num2 = "+(r/t));
                break;
            default:
                System.out.println("Error");
        }
    }

    /**
     * Even or Odd number
     * @param f
     */
    public static void evenOrOdd(int f){

        switch(f%2){
            case(1) :
                System.out.println(f+" Odd number");
                break;
            default:
                System.out.println(f+" Even number");
        }

    }

    /**
     * Enter 0-9 or something
     * @param e
     */
    public static void switchNumbers(String e){

        switch (e){
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                System.out.println(e);
                break;
            default:
                System.out.println("Not allowed");

        }

    }
    /**
     * Vowel||is a non vowel letters
     * @param txt5
     */
    public static void letters(String txt5){

    switch (txt5){
        case ("a"):
        case ("e"):
        case ("i"):
        case ("o"):
        case ("u"):
            System.out.println(txt5+" is a Vowel");
            break;
        default: System.out.println(txt5+" is a Non-Vowel");
    }

    }
    /**
     * Correct Answer
     */
    public static void correctAnswer(String txt4){

        switch (txt4){
            case ("a"):
                System.out.println("Invalide choice");
                break;
            case ("b"):
                System.out.println("Congratulation");
                break;
            case ("c"):
                System.out.println("Invalide choice");
                break;
            case ("d"):
                System.out.println("Invalide choice");
                break;

        }
    }



    /**
     * Maximum Number
     * @param x
     * @param y
     * @param z
     */
    public static void threeNumbers(int x,int y,int z){
        int max;
        max = (x > y)? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("Maximum number: "+max);

    }


    /**
     *
     * @param txt3
     */
    public static void ternaryOpString(String txt3){
//        String txt3 = new String();
        int a = (txt3 == null) ? -1 : (txt3.equals(" ")) ? 0 : 1;
        System.out.println(a);

    }

    /**
     * Math.abs() function
     * @param a
     */
    public static void  ternaryOpAbs(int a){
        int c = a < 0 ? a - (2*a) : a;
        System.out.println("Math.abs(number): "+c);
    }

    /**
     * Math.Max(a,b) function
     * @param a
     * @param b
     */
    public  static void ternaryOpMax(int a,int b){
        int c = a >= b ? a : b;
        System.out.println("Max number: "+c);
    }

    /**
     * Number is positive,negative or 0
     * @param num1
     */
    public static void intNumber(int num1){
        if(num1 > 0){
            System.out.println("positive");
        }else if(num1 == 0) {
            System.out.println(0);
        }else {
            System.out.println("negative");
        }
    }

    /**
     *
     * Two text
     */
    public static void twoString(){
        String txt1 = new String("Test text");
        String txt2 = "Test text";
        if(txt1 == txt2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        if(txt1.equals(txt2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    /**
     * Two text
     * @param txt1
     * @param txt2
     */
    public static void twoText(String txt1, String txt2) {
        if (txt1 == txt2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        if (txt1.equals(txt2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);

//        System.out.println("Two Strings");
//        System.out.print("Enter String 1: ");
//        String txt1 = sc.nextLine();
//        System.out.print("Enter String 2: ");
//        String txt2 = sc.nextLine();
//        twoText(txt1, txt2);
//
//        System.out.println("Two Strings");
//        twoString();
//
//        System.out.println("integer");
//        System.out.print("Enter Integer number: ");
//        int num1 = sc.nextInt();
//        intNumber(num1);
//
//        System.out.println("Math.max(a,b)");
//        System.out.print("Enter number 1: ");
//        int a = sc.nextInt();
//        System.out.print("Enter number 2: ");
//        int b = sc.nextInt();
//        ternaryOpMax(a,b);
//
//        System.out.println("Math.abs(a)");
//        System.out.print("Enter number: ");
//        int c = sc.nextInt();
//        ternaryOpAbs(c);
//
//        System.out.println("Ternary Operator String");
//        System.out.print("Enter String: ");
//        String txt3 = txt.nextLine();
//        ternaryOpString(txt3);
//
//        System.out.println("Math.max(a,b)");
//        System.out.print("Enter number 1: ");
//        int x = sc.nextInt();
//        System.out.print("Enter number 2: ");
//        int y = sc.nextInt();
//        System.out.print("Enter number 3: ");
//        int z = sc.nextInt();
//        threeNumbers(x,y,z);
//
//
//        System.out.println("Correct Answer");
//        System.out.println("a. int 1x=10;\n" +
//                "b. int x=10;\n" +
//                "c. float x=10.0f;\n" +
//                "d. string x='10'\n");
//        System.out.print("Enter a,b,c or d: ");
//        String txt4 = txt.nextLine();
//        correctAnswer(txt4);
//
//
//        System.out.println("Letters");
//        System.out.print("Enter letter: ");
//        String txt5 = txt.nextLine();
//        letters(txt5);

//        System.out.print("Enter something: ");
//        String e = txt.nextLine();
//
//        switchNumbers(e);
//

//        System.out.print("Enter number: ");
//        int f = sc.nextInt();
//        evenOrOdd(f);
//
//        System.out.print("Enter number 1: ");
//        int r = sc.nextInt();
//        System.out.print("Enter number 2: ");
//        int t = sc.nextInt();
//        System.out.print("Enter +,-,* or / : ");
//        String u = txt.nextLine();
//        calculator(r,t,u) ;

//        System.out.print("Enter week day : ");
//        String txt1 = txt.nextLine();
//        weekDay(txt1);

        System.out.print("Enter quiz: ");
        int x = sc.nextInt();
        System.out.print("Enter mid-term: ");
        int y = sc.nextInt();
        System.out.print("Enter final scores: ");
        int z = sc.nextInt();
        estimation(x,y,z);
    }
}
