package DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Repositoryy extends JpaRepository<User, Long> {
}
