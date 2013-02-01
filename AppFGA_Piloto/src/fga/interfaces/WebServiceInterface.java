package fga.interfaces;

import org.ksoap2.serialization.SoapSerializationEnvelope;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Define o comportamento da comunição a nível de novos recursos com o web service  **/
public interface WebServiceInterface {
	
	/** Método responsável pela abertura da conexão com o servidor e que permite à classe fazer requisições mais detalhadas ao WebService **/
	public void abrirConexao(SoapSerializationEnvelope envelope);
	
	/** Que termina a conexão e que pode lançar um feedback ao usuário **/
	public void fecharConexao();
	
}
