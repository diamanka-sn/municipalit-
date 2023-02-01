package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.monolitique.entities.Declare;

public interface DeclareRepository extends JpaRepository<Declare, Long> {

}
