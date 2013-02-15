package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller respons�vel pelo controle da tela de noticia **/
public class ActivityNoticiaController {
	//Vari�vei est�tica com a �nica inst�ncia do controller
	private static ActivityNoticiaController instanciaUnica;
	
	/** M�todo resposn�vel por retornar a �nica inst�ncia do controller, padr�o singleton de projetos. **/
	public static synchronized ActivityNoticiaController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityNoticiaController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
