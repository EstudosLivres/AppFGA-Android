package fga.controller;
/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller respons�vel pelo controle da tela de ajuda **/
public class ActivityAjudaController {

	//Vari�vei est�tica com a �nica inst�ncia do controller
	private static ActivityAjudaController instanciaUnica;
	
	/** M�todo resposn�vel por retornar a �nica inst�ncia do controller, padr�o singleton de projetos. **/
	public static synchronized ActivityAjudaController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityAjudaController();
    return instanciaUnica;
  }//fim do getInstance
	
}//fim da classe
