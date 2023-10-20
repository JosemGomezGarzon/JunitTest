
import com.mycompany.validacionpassword.validatePass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class validarPass {

    @Test
    public void testPasswordMatch() {
        // Test para comprobar que la contraseña coincida
        assertTrue(validatePass.validatepassword("Abc@1234", "Abc@1234"));
    }

    @Test
    public void testPasswordsDoNotMatch() {
        // Test para comprobar que las contraseñas no coincidan
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()
                -> validatePass.validatepassword("Mismatch1@", "Mismatch2@"));
        assertEquals("Las contraseñas no coinciden.", exception.getMessage());
    }

    @Test
    public void testShortPassword() {
        // Test para comprabar el tamaño de la contraseña
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()
                -> validatePass.validatepassword("Short1@", "Short1@"));
        assertEquals("La contraseña debe tener al menos 8 caracteres.", exception.getMessage());
    }

    @Test
    public void testPasswordWithSpace() {
        // Test para comprobar que la contraseña no tenga espacio
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()
                -> validatePass.validatepassword("With Space1@", "With Space1@"));
        assertEquals("La contraseña no debe contener espacios en blanco.", exception.getMessage());
    }

    @Test
    public void testPasswordWithoutLowerCase() {
        // Test para comprobar que la contraseña no tenga minusculas
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()
                -> validatePass.validatepassword("WITHOUTLOWERCASE1@", "WITHOUTLOWERCASE1@"));
        assertEquals("La contraseña debe contener al menos un carácter en minúscula, uno en mayúscula, un número y un carácter especial.", exception.getMessage());
    }

    @Test
    public void testPasswordWithoutUpperCase() {
        // Test para comprobar que la contraseña no tenga mayusculas
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()
                -> validatePass.validatepassword("withoutuppercase1@", "withoutuppercase1@"));
        assertEquals("La contraseña debe contener al menos un carácter en minúscula, uno en mayúscula, un número y un carácter especial.", exception.getMessage());
    }

    @Test
    public void testPasswordWithoutDigit() {
        // Test para comprobar que la contraseña no tenga numeros
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()
                -> validatePass.validatepassword("WithoutDigit@@", "WithoutDigit@@"));
        assertEquals("La contraseña debe contener al menos un carácter en minúscula, uno en mayúscula, un número y un carácter especial.", exception.getMessage());
    }

    @Test
    public void testPasswordWithoutSpecialChar() {
        // Test para comprobar que la contraseña no tenga un caracter especial
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()
                -> validatePass.validatepassword("WithoutSpecialChar1", "WithoutSpecialChar1"));
        assertEquals("La contraseña debe contener al menos un carácter en minúscula, uno en mayúscula, un número y un carácter especial.", exception.getMessage());
    }

}
