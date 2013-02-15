package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller responsável pelo controle da tela dos onibus **/
public class ActivityOnibusController {
	//Variávei estática com a única instância do controller
	private static ActivityOnibusController instanciaUnica;
	
	/** Método resposnável por retornar a única instância do controller, padrão singleton de projetos. **/
	public static synchronized ActivityOnibusController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityOnibusController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
