package nl.nielsb.banking.shared.entities;

import jakarta.persistence.*;
import lombok.*;
import nl.nielsb.banking.shared.entities.enums.TransactionStatus;
import nl.nielsb.banking.shared.entities.enums.TransactionType;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction  {

    @Id
    @GeneratedValue
    private UUID id;
    @Column(name = "tx_id")
    private UUID txId;
    @Enumerated(value = EnumType.STRING)
    private TransactionType type;
    @Enumerated(value = EnumType.STRING)
    private TransactionStatus status;
    private BigDecimal amount;
    @CreatedDate
    @Column(updatable = false)
    private Instant createdAt;
}
