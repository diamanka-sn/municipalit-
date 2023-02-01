package sn.mairie.monolitique.entities;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name = "Mentions")
public class Mention {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String apposition;
	private String libele;
	
	@ManyToMany
	@JoinTable(name = "T_Mentions_DeclarationNaissance",
			joinColumns = @JoinColumn(name = "idMention"),
			inverseJoinColumns = @JoinColumn(name = "idDeclarationNaissance"))
	private Collection<DeclarationNaissance> declarationNaissances;
	
	@ManyToMany
	@JoinTable(name = "T_Mentions_DeclarationMariage",
			joinColumns = @JoinColumn(name = "idMention"),
			inverseJoinColumns = @JoinColumn(name = "idDeclarationMariage"))
	private Collection<DeclarationNaissance> declarationMariages;

}
