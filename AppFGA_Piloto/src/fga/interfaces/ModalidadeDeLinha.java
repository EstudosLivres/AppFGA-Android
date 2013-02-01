package fga.interfaces;

import fga.interfaces.superclasses.WebServiceInteracao;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Define o comportamento das modalidades de linhas de onibus **/
public interface ModalidadeDeLinha extends WebServiceInteracao{
	
	/** Método responsável por retorna o calculo da possível localidade da lotação - "TODO" para a segunda entrega **/
	public String calculaLocalizacao();
	
	/** Método responsável por criar a mensagem de alerta de que um onibus passou em um ponto tal - "TODO" para a segunda entrega **/
	public String alertaPassagemPorUmPonto();
	
}
