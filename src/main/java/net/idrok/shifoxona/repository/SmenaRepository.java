package net.idrok.shifoxona.repository;

import net.idrok.shifoxona.entity.Smena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmenaRepository extends JpaRepository<Smena, Long> {
}
