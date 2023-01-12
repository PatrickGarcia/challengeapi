package usecases.password;

public class InputValidatePasswordDto {

    private String password;

    public InputValidatePasswordDto() {
    }
    public InputValidatePasswordDto(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
