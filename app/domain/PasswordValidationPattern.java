package domain;

public class PasswordValidationPattern implements ValidationPattern {
    private final String pattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?:([0-9a-zA-Z!@#$%^&*()-+])(?!.*\\1)){9,}$";

    public boolean isValid(String value){
        return value != null && value.matches(this.pattern);
    }



}
