package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.monolitique.entities.Mere;

public interface MereRepository extends JpaRepository<Mere, Long> {
	Mere findByPrenom(String prenom);
}
