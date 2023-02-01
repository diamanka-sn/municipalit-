package sn.mairie.monolitique.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import sn.mairie.monolitique.entities.Pere;
import sn.mairie.monolitique.metier.IPereMetier;

@RestController
public class PereController {
	
	@Autowired
	private IPereMetier pereMetier;

	@RequestMapping(value = "/peres", method = RequestMethod.POST)
	public Pere savePere(@RequestBody @Valid Pere p) {
		return pereMetier.savePere(p);
	}

	@RequestMapping(value = "/pere111s", method = RequestMethod.GET)
	public List<Pere> listPeres() {
		return pereMetier.listPeres();
	}

}
