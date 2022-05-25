package util;

import java.util.Scanner;

public class DetailsUtil {

    public static String enterName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        return sc.nextLine();
    }

    public static String enterSurname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter surname:");
        return sc.nextLine();
    }
}