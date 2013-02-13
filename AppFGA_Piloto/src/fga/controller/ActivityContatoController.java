package fga.controller;

import fga.modelo.value_object.ContatoTelefone;

/**
 * 
 * @author Ilton Garcia e Kanashiro
 *
 */

/** Controlador da tela de contato **/
public class ActivityContatoController {
	
	//Strings com os valores dos numeros de contato da faculdade
	private final String telSecretaria = "3107 8901", telCPD = "3107 8910", telDirecao = "3107 8904", 
						 telAdministracao = "3107 8906", telCoodernacaoGeral = "3107 8907";  

	//Instanciação do objeto
	public final ContatoTelefone telefones = new ContatoTelefone(telSecretaria, telCPD, telDirecao, telAdministracao, telCoodernacaoGeral);
	
	

}//fim da classe
