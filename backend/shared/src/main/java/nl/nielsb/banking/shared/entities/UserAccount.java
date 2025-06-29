package nl.nielsb.banking.shared.entities;

import jakarta.persistence.*;
import lombok.*;
import nl.nielsb.banking.shared.entities.auditing.Auditable;
import nl.nielsb.banking.shared.entities.ids.UserAccountId;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_account")
@IdClass(UserAccountId.class)
public class UserAccount extends Auditable {

    @Id
    @OnDelete(action = OnDeleteAction.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @Id
    @OnDelete(action = OnDeleteAction.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;
}
