package net.idrok.shifoxona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.shifoxona.entity.Bino;
@Repository
public interface BinoRepository extends JpaRepository<Bino, Long> {
}