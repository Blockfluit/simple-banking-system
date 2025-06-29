package nl.nielsb.banking.shared.entities.ids;

import lombok.EqualsAndHashCode;
import nl.nielsb.banking.shared.entities.Account;
import nl.nielsb.banking.shared.entities.User;

import java.io.Serializable;

@EqualsAndHashCode
public class UserAccountId implements Serializable {

    private User user;
    private Account account;
}
