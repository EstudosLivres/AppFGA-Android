package fga.grafico.suporte;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import fga.grafico.R;
import fga.modelo.value_object.EventoVO;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Adaptador da criação para criar lista com itens de Eventos **/
public class EventosAdapter extends ArrayAdapter<EventoVO>{
	//Atributos
	private final Context context;
	private final EventoVO[] eventos;
	
	private final String TAG = "NoticiasAdapter";
	
	public EventosAdapter(Context context, EventoVO[] eventos) {
	    super(context, R.layout.noticia_item, eventos);
	    Log.i(TAG, TAG + " iniciado.");
	    this.context = context;
	    this.eventos = eventos;
	}//fim do construtor
	
	@Override
	  public View getView(int position, View convertView, ViewGroup parent) {
		//Armazenando o inflater do contexto aonde a lista ser‡ presentada
	    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    
	    //Guardando o item da lista
	    View eventoItem = inflater.inflate(R.layout.evento_item, parent, false);
	    
	    //Puxando os componentes gr‡ficos do XML
	    TextView tvNome = (TextView) eventoItem.findViewById(R.tv.EventoNome);
	    TextView tvHorario = (TextView) eventoItem.findViewById(R.tv.EventoHorario);
	    TextView tvData = (TextView) eventoItem.findViewById(R.tv.EventoData);
	    
	    //Settando os valores aos componentes gr‡ficos
	    tvNome.setText(eventos[position].nome);
	    tvData.setText(eventos[position].getDataInfo());
	    tvHorario.setText(eventos[position].getHorarioInfo());
//	    tvCorpo.setText(noticias[position].content); TODO
	    
	    
	    return eventoItem;
	  }//fim do getView
	

}//fim da classe
