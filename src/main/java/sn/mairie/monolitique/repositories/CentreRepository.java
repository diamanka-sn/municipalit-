package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.monolitique.entities.Centre;

public interface CentreRepository extends JpaRepository<Centre, Long> {

}
