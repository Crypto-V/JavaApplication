package javaCourse1;

import java.util.Scanner;

public class Leson3 {
    public static void main(String[] args) {

        System.out.println("Welcome To Our Calculator");
        System.out.println("Final Exam score !!! ");

        Scanner Imput = new Scanner(System.in);
        System.out.println("Pick one subject: Math or Java ");
        String subject = Imput.nextLine();
        System.out.println(" Enter your final grade: ");
        int value = Imput.nextInt();


        switch (subject) {
            case "Java":
                if (value > 70) {
                    System.out.println("You will get distinction !! Congratulations!!");
                    break;
                } else if (value >= 60 && value <= 70) {
                    System.out.println("You will get 2.1 !!");
                    break;
                } else if (value >= 50 && value <= 60) {
                    System.out.println("You will get 2.2 !!");
                    break;
                } else if (value >= 40 && value <= 50) {
                    System.out.println("You will get 3rd !!");
                    break;
                } else {
                    System.out.println("Your score is to low ! Sorry You Fail");

                    System.out.println("Your Score is: " + value);
                    System.out.println("you selected : " + subject);
                    break;
                }

                    case "Math":
                        if (value > 70) {
                            System.out.println("You will get distinction !! Congratulations!!");
                            break;
                        } else if (value >= 60 && value <= 70) {
                            System.out.println("You will get a degree !!");
                            break;
                        } else if (value >= 50 && value <= 60) {
                            System.out.println("You will get 2.2 !!");
                            break;
                        } else if (value >= 40 && value <= 50) {
                            System.out.println("You will get 3rd !!");
                            break;
                        } else {
                            System.out.println("Your score is to low ! Sorry You Fail");

                            System.out.println("Your Score is: " + value);
                            System.out.println("you selected : " + subject);
                            break;

                        } default:
                            erorr();

        }

        }
        public static void erorr(){
            System.out.println("404 |This value does not exist");
        }
    }
