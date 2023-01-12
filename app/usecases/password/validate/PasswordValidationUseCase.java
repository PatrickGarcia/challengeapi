package usecases.password.validate;

import domain.password.PasswordValidationPattern;
import play.Logger;
import usecases.password.InputValidatePasswordDto;
import usecases.password.OutputValidatePasswordDto;

public class PasswordValidationUseCase{

    private final static Logger.ALogger appLogger = Logger.of("app");
    private final PasswordValidationPattern pattern = new PasswordValidationPattern();

    public OutputValidatePasswordDto execute(InputValidatePasswordDto input) {
        appLogger.info("Executando validação");
        boolean valid = pattern.isValid(input.getPassword());
        appLogger.info("Validação finalizada");

        return new OutputValidatePasswordDto(valid);

    }




}
