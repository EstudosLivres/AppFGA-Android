package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller responsável pelo controle da tela de noticia **/
public class ActivityNoticiaController {
	//Variávei estática com a única instância do controller
	private static ActivityNoticiaController instanciaUnica;
	
	/** Método resposnável por retornar a única instância do controller, padrão singleton de projetos. **/
	public static synchronized ActivityNoticiaController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityNoticiaController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
