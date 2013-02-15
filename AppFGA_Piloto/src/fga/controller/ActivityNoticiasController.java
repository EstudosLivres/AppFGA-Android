package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller responsável pelo controle da tela de notícia **/
public class ActivityNoticiasController {
	//Variávei estática com a única instância do controller
	private static ActivityNoticiasController instanciaUnica;
	
	/** Método resposnável por retornar a única instância do controller, padrão singleton de projetos. **/
	public static synchronized ActivityNoticiasController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityNoticiasController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
