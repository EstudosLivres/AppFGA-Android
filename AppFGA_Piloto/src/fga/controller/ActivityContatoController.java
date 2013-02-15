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

	//Instancia��o do objeto
	public final ContatoTelefone telefones = new ContatoTelefone(telSecretaria, telCPD, telDirecao, telAdministracao, telCoodernacaoGeral);
	
	//Vari�vei est�tica com a �nica inst�ncia do controller
	private static ActivityContatoController instanciaUnica;
	
	/** M�todo resposn�vel por retornar a �nica inst�ncia do controller, padr�o singleton de projetos. **/
	public static synchronized ActivityContatoController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityContatoController();
    return instanciaUnica;
  }//fim do getInstance

}//fim da classe
