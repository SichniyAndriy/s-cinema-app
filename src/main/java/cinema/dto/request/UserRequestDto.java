package cinema.dto.request;

import java.util.Set;
import javax.validation.constraints.Size;
import cinema.lib.FieldsValueMatch;
import cinema.lib.ValidEmail;
import cinema.model.Role;

@FieldsValueMatch(
        field = "password",
        fieldMatch = "repeatPassword",
        message = "Passwords do not match!"
)
public class UserRequestDto {
    @ValidEmail
    private String email;
    @Size(min = 8, max = 40)
    private String password;
    private String repeatPassword;
    private Set<Role> roles;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public Set<Role> getRoles() {
        return roles;
    }
}
