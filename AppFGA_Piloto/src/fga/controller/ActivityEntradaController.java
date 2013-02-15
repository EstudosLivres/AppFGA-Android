package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller respons�vel pelo controle da tela de entrada "splash screen" **/
public class ActivityEntradaController {
	//Vari�vei est�tica com a �nica inst�ncia do controller
	private static ActivityEntradaController instanciaUnica;
	
	/** M�todo resposn�vel por retornar a �nica inst�ncia do controller, padr�o singleton de projetos. **/
	public static synchronized ActivityEntradaController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityEntradaController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
