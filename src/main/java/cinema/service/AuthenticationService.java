package cinema.service;

import java.util.Set;
import cinema.model.Role;
import cinema.model.User;

public interface AuthenticationService {
    User register(String email, String password, Set<Role> roles);
}
