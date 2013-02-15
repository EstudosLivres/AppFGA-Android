package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller responsável pelo controle da tela de entrada "splash screen" **/
public class ActivityEntradaController {
	//Variávei estática com a única instância do controller
	private static ActivityEntradaController instanciaUnica;
	
	/** Método resposnável por retornar a única instância do controller, padrão singleton de projetos. **/
	public static synchronized ActivityEntradaController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityEntradaController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
