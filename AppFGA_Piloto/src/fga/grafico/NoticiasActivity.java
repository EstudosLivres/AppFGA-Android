package fga.grafico;

import fga.grafico.R;
import fga.grafico.interfaces.RotinaGraficaBase;
import fga.grafico.suporte.NoticiasAdapter;
import fga.modelo.value_object.NoticiaVO;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.app.ListActivity;
import android.content.Intent;

/**
 * @author Ilton Garcia
 * Data do primeiro coment‡rio: 07/09
 */

/** Classe respons‡vel pela tela da lista de todas not’cias **/
public class NoticiasActivity extends ListActivity implements RotinaGraficaBase{
	
	/** vari‡vel TAG a ser usada na impress‹o de logs **/
	private String TAG = "NoticiasActivity";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, TAG + " iniciada.");
        inicializarComponentes();
        definirEventos();
    }//fim do onCreate

    public void inicializarComponentes(){
    	// TODO Array apenas para exibir um preview da tela (Activiy), deve ser preenchida pelo banco, por um objeto DAO
    	NoticiaVO[] noticias = new NoticiaVO[15];
    	
    	//Preenchendo as noticias
    	for(int count = 0; count < noticias.length; count++){
    		noticias[count] = new NoticiaVO(this.getString(R.string.noticia_titulo), this.getString(R.string.noticia_data), this.getString(R.string.noticia_texto));
    	}//fim do for
    	
    	NoticiasAdapter adapter = new NoticiasAdapter(this, noticias);
    	setListAdapter(adapter);
    }//fim do inicializarComponentes
    
    public void definirEventos(){
    	//TODO
    }//fim do definirEventos
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
      //NoticiaVO item = (NoticiaVO) getListAdapter().getItem(position);
      startActivity(new Intent(this, NoticiaActivity.class));
    }
    
}//fim da classe
