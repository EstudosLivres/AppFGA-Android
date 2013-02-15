package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller respons�vel pelo controle da tela principal/inicial de uso de internet **/
public class ActivityMainController {
	//Vari�vei est�tica com a �nica inst�ncia do controller
	private static ActivityMainController instanciaUnica;
	
	/** M�todo resposn�vel por retornar a �nica inst�ncia do controller, padr�o singleton de projetos. **/
	public static synchronized ActivityMainController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityMainController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
