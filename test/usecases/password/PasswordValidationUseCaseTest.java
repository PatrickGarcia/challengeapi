package usecases.password;

import org.junit.jupiter.api.Test;
import usecases.password.validate.PasswordValidationUseCase;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordValidationUseCaseTest {

    @Test
    void validateWrongPassaword() {

        InputValidatePasswordDto input = new InputValidatePasswordDto("AbTp9!foA");
        PasswordValidationUseCase validatePassword = new PasswordValidationUseCase();
        OutputValidatePasswordDto output = validatePassword.execute(input);

        assertFalse(output.getValid());

    }

    @Test
    void validateCorrectPassaword() {

        InputValidatePasswordDto input = new InputValidatePasswordDto("AbTp9!foK");
        PasswordValidationUseCase validatePassword = new PasswordValidationUseCase();
        OutputValidatePasswordDto output = validatePassword.execute(input);

        assertTrue(output.getValid());

    }
}