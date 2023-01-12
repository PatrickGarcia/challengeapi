package usecases;

import domain.PasswordValidationPattern;
import play.Logger;

public class PasswordValidation implements FieldValidation {

    private final static Logger.ALogger appLogger = Logger.of("app");
    private final PasswordValidationPattern pattern = new PasswordValidationPattern();

    @Override
    public boolean execute(String value) {
        appLogger.info("Executando validação");
        return pattern.isValid(value);

    }


}
