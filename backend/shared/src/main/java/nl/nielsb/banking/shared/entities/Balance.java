package nl.nielsb.banking.shared.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "balance")
public class Balance {

    @Id
    @GeneratedValue
    private UUID id;
    private BigDecimal amount;
    @Column(nullable = false)
    private Currency currency;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;
}
