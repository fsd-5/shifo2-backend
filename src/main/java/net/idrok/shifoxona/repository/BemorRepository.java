package net.idrok.shifoxona.repository;

import net.idrok.shifoxona.entity.Bemor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BemorRepository extends JpaRepository<Bemor, Long>{
    
}
