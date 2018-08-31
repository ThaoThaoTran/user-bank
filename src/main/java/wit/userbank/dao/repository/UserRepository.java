package wit.userbank.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wit.userbank.dao.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
