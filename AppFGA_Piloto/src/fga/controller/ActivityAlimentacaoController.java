package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller responsável pelo controle da tela de alimentação **/
public class ActivityAlimentacaoController {
	//Variávei estática com a única instância do controller
	private static ActivityAlimentacaoController instanciaUnica;
	
	/** Método resposnável por retornar a única instância do controller, padrão singleton de projetos. **/
	public static synchronized ActivityAlimentacaoController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityAlimentacaoController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
