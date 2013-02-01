package fga.interfaces;

import org.ksoap2.serialization.SoapSerializationEnvelope;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Define o comportamento da comuni��o a n�vel de novos recursos com o web service  **/
public interface WebServiceInterface {
	
	/** M�todo respons�vel pela abertura da conex�o com o servidor e que permite � classe fazer requisi��es mais detalhadas ao WebService **/
	public void abrirConexao(SoapSerializationEnvelope envelope);
	
	/** Que termina a conex�o e que pode lan�ar um feedback ao usu�rio **/
	public void fecharConexao();
	
}
