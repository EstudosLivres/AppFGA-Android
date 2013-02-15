package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller respons�vel pelo controle das telas de evento **/
public class ActivityEventoController {
	//Vari�vei est�tica com a �nica inst�ncia do controller
	private static ActivityEventoController instanciaUnica;
	
	/** M�todo resposn�vel por retornar a �nica inst�ncia do controller, padr�o singleton de projetos. **/
	public static synchronized ActivityEventoController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityEventoController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
