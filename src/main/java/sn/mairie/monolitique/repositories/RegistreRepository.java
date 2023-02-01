package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mairie.monolitique.entities.Registre;

public interface RegistreRepository extends JpaRepository<Registre, Long> {

}
