package nl.nielsb.banking.shared.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import nl.nielsb.banking.shared.entities.auditing.Auditable;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account extends Auditable {

    @Id
    @GeneratedValue
    private UUID id;
    private String iban;
    private BigDecimal balance;
}
