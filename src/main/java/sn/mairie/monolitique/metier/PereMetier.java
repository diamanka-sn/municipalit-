package sn.mairie.monolitique.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.mairie.monolitique.entities.Pere;
import sn.mairie.monolitique.repositories.PereRepository;

@Service
public class PereMetier implements IPereMetier {
	
	@Autowired
	private PereRepository pereRepository;

	@Override
	public Pere savePere(Pere p) {
		return pereRepository.save(p);
	}

	@Override
	public List<Pere> listPeres() {
		return pereRepository.findAll();
	}

	@Override
	public void deletePere(Pere p) {
		pereRepository.delete(p);
	}

	@Override
	public Pere editPere(Pere p, Long id) {
		Pere pp = pereRepository.findById(id).get();
		
		if (pp != null) {
			
			if (p.getId() != null )
				pp.setId(p.getId());
			
			if (p.getPrenom() != null)
				pp.setPrenom(p.getPrenom());
			if (p.getNom() != null)
				pp.setNom(p.getNom());
			if (p.getDateDeNaissance() != null)
				pp.setDateDeNaissance(p.getDateDeNaissance());
			if (p.getLieuDeNaissance() != null)
				pp.setLieuDeNaissance(p.getLieuDeNaissance());
			if (p.getCni() != null)
				pp.setCni(p.getCni());
			if (p.getProfession() != null)
				pp.setProfession(p.getProfession());
			if (p.getAdresse() != null)
				pp.setAdresse(p.getAdresse());
			if (p.getDeclarationNaissance() != null)
				pp.setDeclarationNaissance(p.getDeclarationNaissance());
			
			pereRepository.save(pp);
		}
		
		return pp;
	}

	@Override
	public Pere findPere(Long id) {
		return pereRepository.findById(id).get();
	}

}
