package nl.nielsb.banking.webapi.authentication.requests;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private LocalDate birthdate;
    private String phoneNumber;
}
