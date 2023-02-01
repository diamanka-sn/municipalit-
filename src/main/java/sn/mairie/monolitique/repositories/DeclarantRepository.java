package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.monolitique.entities.Declarant;

public interface DeclarantRepository extends JpaRepository<Declarant, Long> {

}
