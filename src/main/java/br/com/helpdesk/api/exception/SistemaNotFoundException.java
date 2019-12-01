package br.com.helpdesk.api.exception;

/**
 * Classes responsavel por customizar uma excecao de sistema n�o encontrado
 * @author j.a.vasconcelos
 *
 */
public class SistemaNotFoundException extends RuntimeException {

	public SistemaNotFoundException(String message) {
		super(message);
	}
	
}
