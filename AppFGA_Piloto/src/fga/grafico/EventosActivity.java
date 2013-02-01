package fga.grafico;

import fga.grafico.interfaces.RotinaGraficaBase;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * @author ilton_unb
 * Data do primeiro coment‡rio: 31/08
 */
public class EventosActivity extends Activity implements RotinaGraficaBase{
	
	/** vari‡vel TAG a ser usada na impress‹o de logs **/
	private String TAG = "Tela de Eventos";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main); TODO
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
