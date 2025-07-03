package nl.nielsb.banking.shared.entities;

import jakarta.persistence.*;
import lombok.*;
import nl.nielsb.banking.shared.entities.auditing.Auditable;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User extends Auditable {

    @Id
    @GeneratedValue
    private UUID id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private LocalDate birthdate;
    private String phoneNumber;
    @ManyToMany
    @JoinTable(
            name = "user_account",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "account_id"))
    private List<Account> accounts;
}
