package br.com.helpdesk.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.helpdesk.api.entidades.Release;
import br.com.helpdesk.api.repository.ReleaseRepository;

/**
 * Classe responsavel por implementar a interface de servico de release
 * @author j.a.vasconcelos
 *
 */
@Service
public class ReleaseServiceImpl implements ReleaseService {

	@Autowired
	private ReleaseRepository repo;
	
	/**
	 * Lista todas as releases cadastradas no sistema
	 */
	public List<Release> list() {
		return (List<Release>) repo.findAll();
	}

}
