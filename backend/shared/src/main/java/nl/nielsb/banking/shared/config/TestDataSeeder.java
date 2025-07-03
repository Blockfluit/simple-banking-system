package nl.nielsb.banking.shared.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.nielsb.banking.shared.entities.Account;
import nl.nielsb.banking.shared.entities.Balance;
import nl.nielsb.banking.shared.entities.User;
import nl.nielsb.banking.shared.repositories.AccountRepository;
import nl.nielsb.banking.shared.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;
import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class TestDataSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final AccountRepository accountRepository;

    @Override
    public void run(String... args) {
        User user = User.builder()
                .birthdate(LocalDate.MIN)
                .email("testuser@test.com")
                .firstname("Niels")
                .lastname("van Bruggen")
                .password("test123")
                .phoneNumber("+316123456")
                .build();

        user = userRepository.save(user);

        Account account = Account.builder()
                .iban("NL21TEST123456789")
                .type(Account.Type.CHECKING)
                .build();

        account = accountRepository.save(account);

        Balance balance = Balance.builder()
                .amount(BigDecimal.valueOf(100))
                .currency(Currency.getInstance("EUR"))
                .account(account)
                .build();

        account.setBalances(Map.of(Currency.getInstance("EUR"), balance));

        accountRepository.save(account);

        log.info("Seeded db with data");
    }
}
