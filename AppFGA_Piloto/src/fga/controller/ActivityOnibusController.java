package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller respons�vel pelo controle da tela dos onibus **/
public class ActivityOnibusController {
	//Vari�vei est�tica com a �nica inst�ncia do controller
	private static ActivityOnibusController instanciaUnica;
	
	/** M�todo resposn�vel por retornar a �nica inst�ncia do controller, padr�o singleton de projetos. **/
	public static synchronized ActivityOnibusController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityOnibusController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
