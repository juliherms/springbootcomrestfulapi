package br.com.helpdesk.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.helpdesk.api.entidades.Sistema;
import br.com.helpdesk.api.exception.SistemaNotFoundException;
import br.com.helpdesk.api.repository.SistemaRepository;

/**
 * Representa uma classe de servicos que prover todos os metodos para a entidade Sistema
 * @author j.a.vasconcelos
 *
 */
@Service
public class SistemaServiceImpl implements SistemaService {
	
	@Autowired
    private SistemaRepository repo;

	/**
	 * Lista todos os sistemas cadastrados na base
	 */
	public List<Sistema> list() {
		return (List<Sistema>) repo.findAll();
	}

	/**
	 * Pesquisa um sistema por id informado
	 */
	public Sistema findSitema(long id) {
		
		Optional<Sistema> sistema = repo.findById(id);
		
		if(sistema.isPresent()) {
			return sistema.get();
		}else {
			throw new SistemaNotFoundException("Sistema informado não encontrado"); 
		}
	}
}
