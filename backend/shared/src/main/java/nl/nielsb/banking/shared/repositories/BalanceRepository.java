package nl.nielsb.banking.shared.repositories;

import nl.nielsb.banking.shared.entities.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BalanceRepository extends JpaRepository<Balance, UUID> {
}
