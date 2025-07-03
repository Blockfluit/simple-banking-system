package nl.nielsb.banking.webapi.authentication.services;

import lombok.RequiredArgsConstructor;
import nl.nielsb.banking.shared.entities.User;
import nl.nielsb.banking.shared.repositories.UserRepository;
import nl.nielsb.banking.webapi.authentication.requests.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;

    public User register(RegisterRequest req) {
        User user = User.builder()
                .firstname(req.getFirstname())
                .lastname(req.getLastname())
                .email(req.getEmail())
                .password(req.getPassword())
                .birthdate(req.getBirthdate())
                .phoneNumber(req.getPhoneNumber())
                .build();

        return userRepository.save(user);
    }
}
