package nl.nielsb.banking.shared.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import nl.nielsb.banking.shared.entities.auditing.Auditable;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "management_user")
public class ManagementUser extends Auditable {

    @Id
    @GeneratedValue
    private UUID id;
    private String username;
    private String password;
}
