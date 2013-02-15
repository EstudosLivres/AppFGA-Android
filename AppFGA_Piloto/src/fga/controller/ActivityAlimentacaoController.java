package fga.controller;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Controller respons�vel pelo controle da tela de alimenta��o **/
public class ActivityAlimentacaoController {
	//Vari�vei est�tica com a �nica inst�ncia do controller
	private static ActivityAlimentacaoController instanciaUnica;
	
	/** M�todo resposn�vel por retornar a �nica inst�ncia do controller, padr�o singleton de projetos. **/
	public static synchronized ActivityAlimentacaoController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new ActivityAlimentacaoController();
    return instanciaUnica;
  }//fim do getInstance
}//fim da classe
