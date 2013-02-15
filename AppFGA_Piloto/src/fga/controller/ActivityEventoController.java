package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller responsável pelo controle das telas de evento **/
public class ActivityEventoController {
	//Variávei estática com a única instância do controller
	private static ActivityEventoController instanciaUnica;
	
	/** Método resposnável por retornar a única instância do controller, padrão singleton de projetos. **/
	public static synchronized ActivityEventoController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityEventoController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
