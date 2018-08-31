package wit.userbank.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wit.userbank.dao.models.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank,Long> {
}
