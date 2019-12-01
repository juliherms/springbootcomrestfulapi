package br.com.helpdesk.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.helpdesk.api.entidades.Incidente;
import br.com.helpdesk.api.repository.IncidenteRepository;

/**
 * Classe responsavel por implementar a interface de incidente
 * 
 * @author j.a.vasconcelos
 *
 */
@Service
public class IncidenteServiceImpl implements IncidenteService {

	@Autowired
	private IncidenteRepository repo;

	/**
	 * Lista todos os incidentes cadastrados no banco de dados
	 */
	public List<Incidente> list() {
		return (List<Incidente>) repo.findAll();
	}

	/**
	 * Pesquisa um incidente por ID informado
	 */
	public Incidente findIncidente(long id) {

		Optional<Incidente> incidente = repo.findById(id);

		if (incidente.isPresent()) {
			return incidente.get();
		}

		return null;

	}
}
