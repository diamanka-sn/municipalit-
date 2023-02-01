package sn.mairie.monolitique.entities;

import java.util.Collection;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor	//Generate construct without arguments
@AllArgsConstructor	//Generate construct with all fields as arguments
@Data	// Generate getters and setters of all fields
@ToString	// Generate a class description
@Entity
@Table(name = "Peres")
public class Pere {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nom", length = 30)
	private String nom;
	private String prenom;
	
	@NotNull
	@Size(max = 13, message = "La taille doit etre egale a 16 caracteres")
	private String cni;
	private String adresse;
	private String profession;
	@Temporal(TemporalType.DATE)
	private Date dateDeNaissance;
	private String lieuDeNaissance;
	
	@JsonIgnore
	@OneToMany(mappedBy = "pere")
	private Collection<DeclarationNaissance> declarationNaissance;
	
	
}
