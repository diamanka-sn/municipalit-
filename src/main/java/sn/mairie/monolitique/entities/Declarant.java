package sn.mairie.monolitique.entities;

import java.util.Collection;
import java.util.Date;

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

@Entity
@Table(name = "Declarants")
@AllArgsConstructor @NoArgsConstructor @Data @ToString
public class Declarant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String CNI;
	private String profession;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String lieuNaissance;
	private String degreParental;
	
	@OneToMany(mappedBy = "declarant")
	private Collection<DeclarationNaissance> declarantionNaissance; 

}
