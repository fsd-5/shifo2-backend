package net.idrok.shifoxona.repository;

import net.idrok.shifoxona.entity.Tuman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TumanRepository extends JpaRepository<Tuman, Long> {
    
}