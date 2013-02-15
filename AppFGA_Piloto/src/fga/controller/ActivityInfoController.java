package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller respons�vel pelo controle das telas de informa��o **/
public class ActivityInfoController {
	//Vari�vei est�tica com a �nica inst�ncia do controller
	private static ActivityInfoController instanciaUnica;
	
	/** M�todo resposn�vel por retornar a �nica inst�ncia do controller, padr�o singleton de projetos. **/
	public static synchronized ActivityInfoController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityInfoController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
