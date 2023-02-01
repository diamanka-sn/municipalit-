package sn.mairie.monolitique.entities;

import java.util.Collection;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor	//Generate construct without arguments
@AllArgsConstructor	//Generate construct with all fields as arguments
@Data	// Generate getters and setters of all fields
@ToString	// Generate a class description
@Entity
@Table(name = "Epoux")
public class Epoux {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String cni;
	private String adresse;
	private String profession;
	@Temporal(TemporalType.DATE)
	private Date dateDeNaissance;
	private String lieuDeNaissance;
	
	@JsonIgnore
	@OneToMany(mappedBy = "epoux")
	private Collection<DeclarationMariage> declarationMariages;

}
