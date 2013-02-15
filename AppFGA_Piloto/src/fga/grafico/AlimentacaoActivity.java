package fga.grafico;

import fga.controller.ActivityAlimentacaoController;
import fga.grafico.superclasses.AbstractActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * @author ilton_unb
 * Data do primeiro comentário: 31/08
 */
public class AlimentacaoActivity extends AbstractActivity {
	
	/** variável TAG a ser usada na impressão de logs **/
	private String TAG = "Tela de Alimentação";
	ActivityAlimentacaoController controller;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main); TODO
        
        //InstanciaÁ„o do controller
        controller = ActivityAlimentacaoController.getInstance();
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

}
