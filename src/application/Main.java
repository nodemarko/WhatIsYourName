package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your Name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Cool name "+name);
    }
}
