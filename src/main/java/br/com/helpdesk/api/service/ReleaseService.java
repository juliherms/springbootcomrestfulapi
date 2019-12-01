package br.com.helpdesk.api.service;

import java.util.List;

import br.com.helpdesk.api.entidades.Release;

/**
 * Interface responsavel por garantir os metodos de servico da classe release
 * @author j.a.vasconcelos
 *
 */
public interface ReleaseService {
	
	/**
	 * Lista todas as releases cadastradas no sistema
	 * @return
	 */
	List<Release> list();

}
