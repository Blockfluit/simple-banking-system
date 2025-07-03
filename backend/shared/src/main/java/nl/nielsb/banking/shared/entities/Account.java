package nl.nielsb.banking.shared.entities;

import jakarta.persistence.*;
import lombok.*;
import nl.nielsb.banking.shared.entities.auditing.Auditable;

import java.util.Currency;
import java.util.List;
import java.util.Map;
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
    @Enumerated(EnumType.STRING)
    private Type type;
    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @MapKey(name = "currency")
    private Map<Currency, Balance> balances;

    public enum Type {
        SAVINGS,
        CHECKING
    }
}
