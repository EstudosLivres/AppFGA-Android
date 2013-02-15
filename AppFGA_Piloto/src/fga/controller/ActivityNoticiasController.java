package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller respons�vel pelo controle da tela de not�cia **/
public class ActivityNoticiasController {
	//Vari�vei est�tica com a �nica inst�ncia do controller
	private static ActivityNoticiasController instanciaUnica;
	
	/** M�todo resposn�vel por retornar a �nica inst�ncia do controller, padr�o singleton de projetos. **/
	public static synchronized ActivityNoticiasController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityNoticiasController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
