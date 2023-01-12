package usecases.password;

public class OutputValidatePasswordDto {

    boolean valid;

    public OutputValidatePasswordDto() {
    }

    public OutputValidatePasswordDto(boolean valid) {
        this.valid = valid;
    }

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
