package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller responsável pelo controle das telas de informação **/
public class ActivityInfoController {
	//Variávei estática com a única instância do controller
	private static ActivityInfoController instanciaUnica;
	
	/** Método resposnável por retornar a única instância do controller, padrão singleton de projetos. **/
	public static synchronized ActivityInfoController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityInfoController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
