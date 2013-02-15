package fga.controller;
/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller responsável pelo controle da tela de ajuda **/
public class ActivityAjudaController {

	//Variávei estática com a única instância do controller
	private static ActivityAjudaController instanciaUnica;
	
	/** Método resposnável por retornar a única instância do controller, padrão singleton de projetos. **/
	public static synchronized ActivityAjudaController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityAjudaController();
    return instanciaUnica;
  }//fim do getInstance
	
}//fim da classe
