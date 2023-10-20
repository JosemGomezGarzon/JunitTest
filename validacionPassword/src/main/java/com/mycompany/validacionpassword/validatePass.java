package com.mycompany.validacionpassword;

/**
 *
 * @author Handi
 */
public class validatePass {
    
        public static boolean validatepassword(String password, String confirmPassword) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres.");
        }

        if (password.contains(" ")) {
            throw new IllegalArgumentException("La contraseña no debe contener espacios en blanco.");
        }

        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        if (!hasLowerCase || !hasUpperCase || !hasDigit || !hasSpecialChar) {
            throw new IllegalArgumentException("La contraseña debe contener al menos un carácter en minúscula, uno en mayúscula, un número y un carácter especial.");
        }

 

        if (!password.equals(confirmPassword)) {
            throw new IllegalArgumentException("Las contraseñas no coinciden.");
        }
        
        return true;
    }
}