package br.com.helpdesk.api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.helpdesk.api.entidades.Incidente;
import br.com.helpdesk.api.entidades.Sistema;
import br.com.helpdesk.api.exception.SistemaNotFoundException;
import br.com.helpdesk.api.service.IncidenteService;
import br.com.helpdesk.api.service.SistemaService;

@RestController
@RequestMapping("/helpdesk")
public class HelpDeskController {

	@Autowired
	private SistemaService sistemaService;
	@Autowired
	private IncidenteService incidenteService;

	/**
	 * Metodo responsavel por listar todos os inicidentes da base de dados.
	 * @return
	 */
	@GetMapping("/incidentes")
	public ResponseEntity<List<Incidente>> getAllIncidentes() {

		List<Incidente> lista = incidenteService.list();
		return new ResponseEntity<List<Incidente>>(lista, HttpStatus.OK);
	}
	
	/**
	 * Metodo responsavel por listar todos os sistemas existentes na base de dados
	 * @return
	 */
	@GetMapping("/sistemas")
	public ResponseEntity<List<Sistema>> getAllSistemas(){
		
		List<Sistema> lista = sistemaService.list();
		return new ResponseEntity<List<Sistema>>(lista,HttpStatus.OK);
	}
	
	
	/**
	 * Pesquisa um sistema por id informado.
	 * @param id
	 * @return
	 */
	@GetMapping("/sistemas/{id}")
	public ResponseEntity<Sistema> getSistema(@PathVariable("id") long id){
	
		try {
			return new ResponseEntity<Sistema>(sistemaService.findSitema(id),HttpStatus.OK);
		} catch(SistemaNotFoundException exception) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Sistema não encontrado");
		}
	}
}
