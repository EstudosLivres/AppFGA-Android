package fga.grafico;

import android.os.Bundle;
import android.util.Log;
import fga.controller.ActivityAjudaController;
import fga.grafico.superclasses.AbstractActivity;

/**
 * @author Ilton Garcia
 * Data do primeiro coment‡rio: 31/08
 */


public class AjudaActivity extends AbstractActivity {
	
	/** vari‡vel TAG a ser usada na impress‹o de logs **/
	private String TAG = "Tela de Ajuda";
	ActivityAjudaController controller;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main); TODO
        
        //Instanciação do controller
        controller = new ActivityAjudaController();
        Log.i(TAG, TAG + " iniciada.");
        inicializarComponentes();
        definirEventos();
    }//fim do onCreate

	public void inicializarComponentes() {
		// TODO Auto-generated method stub
		
	}

	public void definirEventos() {
		// TODO Auto-generated method stub
		
	}

    

}//fim da classe
