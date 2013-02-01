package fga.grafico;

import fga.grafico.interfaces.RotinaGraficaBase;
import fga.grafico.superclasses.ActivityAbstrata;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author ilton_unb
 * Data do primeiro coment�rio: 31/08
 * Data da ultima de vers�o da classe: 31/08 
 */

/** Classe que abstrai a tela principal/inicial do app **/
public class MainActivity extends ActivityAbstrata implements RotinaGraficaBase{

	/** vari�vel TAG a ser usada na impress�o de logs **/
	private String TAG = "MainActivity";
	
	//Componentes gr�ficos
	Button btnNoticias, btnEventos, btnOndeComer, btnTransporte, btnContatos;	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        Log.i(TAG, TAG + " iniciada.");
        inicializarComponentes();
        definirEventos();
    }//fim do onCreate

	public void inicializarComponentes() {
		//Puxando os componentes do XML
		btnNoticias = (Button) findViewById(R.bt.Noticia);
		btnEventos = (Button) findViewById(R.bt.Eventos);
		btnOndeComer = (Button) findViewById(R.bt.OndeComer);
		btnTransporte = (Button) findViewById(R.bt.Transporte);
		btnContatos = (Button) findViewById(R.bt.Contatos);
	}//fim do inicializarComponentes

	public void definirEventos() {
		
		//Evento sobre o bot�o noticia
		btnNoticias.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this, NoticiasActivity.class);
				startActivity(it);
			}//fim do onClick
		});//fim do evento de click sobre o bot�o noticia
		
	}//fim do definirEventos
    
}//fim da classe
