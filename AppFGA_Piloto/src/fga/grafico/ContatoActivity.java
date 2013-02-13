package fga.grafico;

import android.app.Activity;
import android.os.Bundle;
import fga.grafico.interfaces.RotinaGraficaBase;

public class ContatoActivity extends Activity implements RotinaGraficaBase{

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contatos);
		inicializarComponentes();
		definirEventos();
	}//fim do onCreate
	
	@Override
	public void inicializarComponentes() {
		// TODO Auto-generated method stub
		
	}//fim do inicializarComponentes

	@Override
	public void definirEventos() {
		// TODO Auto-generated method stub
		
	}//fim do definirEventos

}//fim da classe
