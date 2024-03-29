/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mariangel
 */import java.text.SimpleDateFormat;
import java.util.*;

public class cli {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cli obj = new cli();
        String formattedDate = obj.fecha();
        System.out.println(formattedDate);
        System.out.println("Motor controller :D");

        int choice;
        do {
            menu();
            System.out.print("What is your choice?  ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The motor is now spinning right ");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("The motor is now spinning left ");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("The motor has stopped");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Goodbye");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Your choice is wrong, please choose another one");
                    System.out.println("");
            }
        } while (choice != 4);
    }

    public String fecha() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy hh:mm aa");
        long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
        String dateFormateada = formato.format(date);
        return dateFormateada;
    }

    public static void menu() {
        System.out.println("====================");
        System.out.println("== MENU ==");
        System.out.println("====================");
        System.out.println("1. Spin right");
        System.out.println("2. Spin left");
        System.out.println("3. Stop");
        System.out.println("4. Exit");
    }
}






