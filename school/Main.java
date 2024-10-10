package school;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final String adminemail="admin@iskool.com";
    private static final String adminpass = "admin123";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();


        while(true){
            System.out.print("/n/nWELCOME TO THE ISKOOL WEB" +
                    "/n/n1.Log In" +
                    "/n2.Sign Up" +
                    "/n0.Exit" +
                    "/n/nSelect an Option: ");
            int welcmenu = sc.nextInt();
            sc.nextLine();
            switch(welcmenu){
                case 1 -> {
                    System.out.print("/n/nLOG IN" +
                            "/nEnter Role(Student/Parent/Teacher/Staff/Admin): ");
                    String role = sc.next();
                    if (user)

                }
                default -> {
                    System.out.println("\nInvalid Entry Try Again");
                }
            }
            if (welcmenu == 0){
                System.out.println("/n/nExiting..." +
                        "/nPress Any Key To Proceed");
                sc.next();
                System.exit(0);
            }

        }

    }
}
