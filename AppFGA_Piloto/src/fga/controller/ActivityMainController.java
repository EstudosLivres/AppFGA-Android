package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller responsável pelo controle da tela principal/inicial de uso de internet **/
public class ActivityMainController {
	//Variávei estática com a única instância do controller
	private static ActivityMainController instanciaUnica;
	
	/** Método resposnável por retornar a única instância do controller, padrão singleton de projetos. **/
	public static synchronized ActivityMainController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityMainController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
