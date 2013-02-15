package fga.controller;

/**
 * 
 * @author ilton_unb
 *
 */

/** Classe responsável por colocar os VOs dentro de adapters (listas) na view **/
public class AdapterController {
	
	//Variávei estática com a única instância do controller
	private static AdapterController instanciaUnica;
	
	/** Método resposnável por retornar a única instância do controller, padrão singleton de projetos. **/
	public static synchronized AdapterController getInstance() {
		if (instanciaUnica == null) 
			instanciaUnica = new AdapterController();
    return instanciaUnica;
  }//fim do getInstance
	
}//fim do Adapter
