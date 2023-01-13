package domain.password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordValidationPatternTest {

    @Test
    void isNotValid() {
        PasswordValidationPattern pattern = new PasswordValidationPattern();

        assertFalse(pattern.isValid(null));
        assertFalse(pattern.isValid("aa"));
        assertFalse(pattern.isValid("ab"));
        assertFalse(pattern.isValid("AAAbbbCc"));
        assertFalse(pattern.isValid("AbTp9!foo"));
        assertFalse(pattern.isValid("AbTp9!foA"));
        assertFalse(pattern.isValid("AbTp9 fok"));


    }

    @Test
    void isValid() {
        PasswordValidationPattern pattern = new PasswordValidationPattern();

        assertTrue(pattern.isValid("AbTp9!fok"));
        assertTrue(pattern.isValid("ItauPG0493!"));
    }
}