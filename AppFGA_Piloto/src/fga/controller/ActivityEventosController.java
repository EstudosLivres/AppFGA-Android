package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller responsável pelo controle da tela de eventos **/
public class ActivityEventosController {
	//Variávei estática com a única instância do controller
	private static ActivityEventosController instanciaUnica;
	
	/** Método resposnável por retornar a única instância do controller, padrão singleton de projetos. **/
	public static synchronized ActivityEventosController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityEventosController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
