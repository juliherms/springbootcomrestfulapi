package br.com.helpdesk.api.service;

import java.util.List;

import br.com.helpdesk.api.entidades.Sistema;

/**
 * Interface responsavel por garantir os meteodos de servico da classe sistema
 * @author j.a.vasconcelos
 *
 */
public interface SistemaService {
	
	/**
	 * retona uma lista de sistemas cadastrados no banco.
	 * @return
	 */
	List<Sistema> list();
	
	/**
	 * Retorna um sistema por ID
	 * @param id
	 * @return
	 */
	Sistema findSitema(long id);

}
