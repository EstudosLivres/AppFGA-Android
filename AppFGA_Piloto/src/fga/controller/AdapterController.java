package fga.controller;

/**
 * 
 * @author ilton_unb
 *
 */

/** Classe respons�vel por colocar os VOs dentro de adapters (listas) na view **/
public class AdapterController {
	
	//Vari�vei est�tica com a �nica inst�ncia do controller
	private static AdapterController instanciaUnica;
	
	/** M�todo resposn�vel por retornar a �nica inst�ncia do controller, padr�o singleton de projetos. **/
	public static synchronized AdapterController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new AdapterController();
    return instanciaUnica;
  }//fim do getInstance
	
}//fim do Adapter
