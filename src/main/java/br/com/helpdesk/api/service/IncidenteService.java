package br.com.helpdesk.api.service;

import java.util.List;

import br.com.helpdesk.api.entidades.Incidente;

/**
 * Classe responsavel por prover os metodos da classe de Incidente
 * 
 * @author j.a.vasconcelos
 *
 */
public interface IncidenteService {

	/**
	 * Lista todos os incidentes cadastrados no banco de dados
	 * @return
	 */
	List<Incidente> list();
	
	/**
	 * Retorna um incidente por ID informado
	 * @param id
	 * @return
	 */
	Incidente findIncidente(long id);

}
