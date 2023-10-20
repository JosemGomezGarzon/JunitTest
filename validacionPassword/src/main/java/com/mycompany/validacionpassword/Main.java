package com.mycompany.validacionpassword;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una contraseña: ");
        String password = scanner.nextLine();

        System.out.println("Confirme la contraseña: ");
        String confirmPassword = scanner.nextLine();

        try {
            if (validatePass.validatepassword(password, confirmPassword)) {
                System.out.println("La contraseña es válida.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
