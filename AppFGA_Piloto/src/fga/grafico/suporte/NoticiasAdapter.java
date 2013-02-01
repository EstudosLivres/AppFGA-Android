package fga.grafico.suporte;

import fga.grafico.R;
import fga.modelo.value_object.NoticiaVO;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class NoticiasAdapter extends ArrayAdapter<NoticiaVO>{
	
	private final Context context;
	private final NoticiaVO[] noticias;
	
	private final String TAG = "NoticiasAdapter";
	
	public NoticiasAdapter(Context context, NoticiaVO[] noticias) {
	    super(context, R.layout.noticia_item, noticias);
	    Log.i(TAG, TAG + " iniciado.");
	    this.context = context;
	    this.noticias = noticias;
	}//fim do construtor
	
	@Override
	  public View getView(int position, View convertView, ViewGroup parent) {
		//Armazenando o inflater do contexto aonde a lista ser‡ presentada
	    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    //Guardando o item da lista
	    View noticiaItem = inflater.inflate(R.layout.noticia_item, parent, false);
	    //Puxando os componentes gr‡ficos do XML
	    TextView tvTitulo = (TextView) noticiaItem.findViewById(R.tv.NoticiaTitulo);
	    TextView tvData = (TextView) noticiaItem.findViewById(R.tv.NoticiaData);
	    TextView tvCorpo = (TextView) noticiaItem.findViewById(R.tv.NoticiaCorpo);
	    
	    //Settando os valores aos componentes gr‡ficos
	    tvTitulo.setText(noticias[position].titulo);
	    tvData.setText(noticias[position].data);
	    tvCorpo.setText(noticias[position].content);
	    
	    
	    return noticiaItem;
	  }//fim do getView
	
}//fim da classe
