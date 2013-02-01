package fga.grafico;

import fga.grafico.interfaces.RotinaGraficaBase;
import android.app.Activity;
import android.os.Bundle;

/**
 * 
 * @author Ilton Garcia
 * Data do primeiro coment‡rio: 08/09
 */

/** Classe respons‡vel pela tela de uma noticia inteira **/
public class NoticiaActivity extends Activity implements RotinaGraficaBase{

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.content_noticia);
	}//fim do onCreate

	public void inicializarComponentes() {
		// TODO Auto-generated method stub
		
	}//fim do inicializarComponentes

	public void definirEventos() {
		// TODO Auto-generated method stub
		
	}//fim do definirEventos

}//fim da clase
