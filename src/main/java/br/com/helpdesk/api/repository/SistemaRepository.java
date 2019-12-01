package br.com.helpdesk.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.helpdesk.api.entidades.Sistema;

/**
 * Representa uma classe de repositorio - acesso a dados
 * 
 * @author j.a.vasconcelos
 *
 */
@Repository
public interface SistemaRepository extends CrudRepository<Sistema, Long> {

}
