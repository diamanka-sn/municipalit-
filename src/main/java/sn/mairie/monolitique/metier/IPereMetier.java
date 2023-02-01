package sn.mairie.monolitique.metier;

import java.util.List;

import sn.mairie.monolitique.entities.Pere;

public interface IPereMetier {
	public Pere savePere(Pere p);
	public List<Pere> listPeres();
	public void deletePere(Pere p);
	public Pere editPere(Pere p, Long id);
	public Pere findPere(Long id);
}
