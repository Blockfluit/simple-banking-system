package nl.nielsb.banking.shared.repositories;

import nl.nielsb.banking.shared.entities.UserAccount;
import nl.nielsb.banking.shared.entities.ids.UserAccountId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, UserAccountId> {
}
