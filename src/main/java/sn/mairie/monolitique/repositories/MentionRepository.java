package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.monolitique.entities.Mention;

public interface MentionRepository extends JpaRepository<Mention, Long> {

}
