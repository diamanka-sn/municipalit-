package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sn.mairie.monolitique.entities.Pere;

@RepositoryRestResource
public interface PereRepository extends JpaRepository<Pere, Long> {
	Pere findByNom(String nom);
}
