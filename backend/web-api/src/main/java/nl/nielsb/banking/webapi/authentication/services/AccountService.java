package nl.nielsb.banking.webapi.authentication.services;

import lombok.RequiredArgsConstructor;
import nl.nielsb.banking.shared.entities.Account;
import nl.nielsb.banking.shared.repositories.AccountRepository;
import nl.nielsb.banking.shared.repositories.BalanceRepository;
import nl.nielsb.banking.shared.repositories.UserRepository;
import nl.nielsb.banking.shared.entities.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final BalanceRepository balanceRepository;
    private final UserRepository userRepository;

    public void createAccount(User user, Account.Type type) {
        Account.builder()
                .iban("NL21TEST123456789")
                .type(type)
                .build();
    }
}
