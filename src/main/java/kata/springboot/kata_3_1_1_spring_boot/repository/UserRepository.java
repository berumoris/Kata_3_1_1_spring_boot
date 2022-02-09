package kata.springboot.kata_3_1_1_spring_boot.repository;

import kata.springboot.kata_3_1_1_spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
