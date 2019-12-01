package br.com.helpdesk.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.helpdesk.api.entidades.Incidente;

/**
 * Representa uma classe de acesso a dados.
 * @author j.a.vasconcelos
 *
 */
@Repository
public interface IncidenteRepository extends CrudRepository<Incidente, Long> {

}
