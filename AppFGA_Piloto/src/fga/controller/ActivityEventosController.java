package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller respons�vel pelo controle da tela de eventos **/
public class ActivityEventosController {
	//Vari�vei est�tica com a �nica inst�ncia do controller
	private static ActivityEventosController instanciaUnica;
	
	/** M�todo resposn�vel por retornar a �nica inst�ncia do controller, padr�o singleton de projetos. **/
	public static synchronized ActivityEventosController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityEventosController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
