package fga.grafico;

import fga.controller.ActivityEventosController;
import fga.grafico.suporte.EventosAdapter;
import fga.modelo.value_object.EventoVO;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

/**
 * @author ilton_unb
 * Data do primeiro coment‡rio: 31/08
 */
public class EventosActivity extends ListActivity {
	
	/** vari‡vel TAG a ser usada na impress‹o de logs **/
	private String TAG = "Tela de Eventos";
	ActivityEventosController controller;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main); TODO
        
        //Instanciação do controller
        controller = ActivityEventosController.getInstance();
        Log.i(TAG, TAG + " iniciada.");
        inicializarComponentes();
        definirEventos();
    }//fim do onCreate

	public void inicializarComponentes() {
		// TODO Auto-generated method stub
		EventoVO[] eventos = new EventoVO[15];
		
		//Preenchendo as noticias
    	for(int count = 0; count < eventos.length; count++)
    		eventos[count] = new EventoVO(this.getString(R.string.evento_nome), this.getString(R.string.evento_local), this.getString(R.string.evento_data_inicio), 
    									  this.getString(R.string.evento_data_termino), this.getString(R.string.evento_horario_inicio), 
    									  this.getString(R.string.evento_horario_termino), this.getString(R.string.evento_tipo_de_evento), 
    									  this.getString(R.string.evento_contato), this.getString(R.string.evento_mais_info));
    	
    	EventosAdapter adapter = new EventosAdapter(this, eventos);
    	setListAdapter(adapter);
	}//fim do inicializar

	public void definirEventos() {
		// TODO Auto-generated method stub
	}//fim do definirEventos
	
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
      startActivity(new Intent(this, EventoActivity.class));
    }//fim do onListItemClick

}//fim da classe
