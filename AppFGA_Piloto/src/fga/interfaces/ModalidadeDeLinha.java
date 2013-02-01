package fga.interfaces;

import fga.interfaces.superclasses.WebServiceInteracao;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Define o comportamento das modalidades de linhas de onibus **/
public interface ModalidadeDeLinha extends WebServiceInteracao{
	
	/** M�todo respons�vel por retorna o calculo da poss�vel localidade da lota��o - "TODO" para a segunda entrega **/
	public String calculaLocalizacao();
	
	/** M�todo respons�vel por criar a mensagem de alerta de que um onibus passou em um ponto tal - "TODO" para a segunda entrega **/
	public String alertaPassagemPorUmPonto();
	
}
