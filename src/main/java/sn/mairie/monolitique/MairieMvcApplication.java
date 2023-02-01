package sn.mairie.monolitique;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.mairie.monolitique.entities.Pere;
import sn.mairie.monolitique.repositories.MereRepository;
import sn.mairie.monolitique.repositories.PereRepository;

@SpringBootApplication
public class MairieMvcApplication implements CommandLineRunner {

	@Autowired
	private PereRepository pereRepository;
	
	@Autowired
	private MereRepository mereRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MairieMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pere pere = pereRepository.save(new Pere(null, "Diop", "Samba", "1234567", "Mermoz, Dakar", "Ingenieur Informatique", new Date(), "Medina rue 31x18", null));
		Pere pere1 = pereRepository.save(new Pere(null, "Ndour", "Masamba", "1256467", "Rufisque", "Ingenieur Informatique", new Date(), "Medina rue 12x16", null));
		
//		Mere mere1 = mereRepository.save(new Mere(null, "Faye", "Rougui", "48594", "Rufisque", "Ingenieur Informatique", new Date(), "Medina rue 12x16", null));

		
//		pereRepository.findAll().forEach(p -> {
//			System.out.println(p.toString());
//		});
		
//		System.out.println(pereRepository.findByNom("Ndour").toString());
		
//		System.out.println(mereRepository.findByPrenom("Faye").toString());


	}

}
