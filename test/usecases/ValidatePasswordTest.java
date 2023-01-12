package usecases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatePasswordTest {

    @Test
    void validateWrongPassaword() {

        PasswordValidation validatePassword = new PasswordValidation();
        boolean result = validatePassword.execute("AbTp9!foA");

        assertFalse(result);

    }

    @Test
    void validateCorrectPassaword() {

        PasswordValidation validatePassword = new PasswordValidation();
        boolean result = validatePassword.execute("AbTp9!fok");

        assertTrue(result);

    }
}