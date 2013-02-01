package fga.grafico.superclasses;

import fga.grafico.interfaces.RotinaGraficaBase;
import android.app.Activity;
import android.os.Bundle;

/**
 * 
 * @author Ilton Garcia
 * Data do primeiro coment�rio: 31/08
 */


public abstract class ActivityAbstrata extends Activity implements RotinaGraficaBase{
	
	
	//M�todo do onCreate  
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
	}//fim do onCreate
	
	
    /** M�todo respons�vel por inicializar os componentes gr�ficos **/
    public abstract void inicializarComponentes();
    /** M�todo respons�vel por definir eventos sobre os componentes gr�ficos **/
    public abstract void definirEventos();
    
}//fim da classe
