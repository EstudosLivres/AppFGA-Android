package fga.grafico;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import fga.controller.ActivityEventoController;
import fga.grafico.superclasses.AbstractActivity;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Classe respons‡ável pela tela de um evento inteiro **/
public class EventoActivity extends AbstractActivity {
	//Atributos do item da lista
	TextView tvNome, tvLocal, tvDataInicio, tvDataTermino, tvHorario, tvTipoEvento, tvContato, tvMaisInfo; 
	ActivityEventoController controller;

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.content_evento);
		
        //Instanciação do controller
        controller = ActivityEventoController.getInstance();
		inicializarComponentes();
		definirEventos();
	}//fim do onCreate
	
	@Override
	public void inicializarComponentes() {
		//Puxando os elementos gráficos do XML
		tvNome = (TextView) findViewById(R.tv.EventoNome); 
		tvLocal = (TextView) findViewById(R.tv.EventoLocal);
		tvDataInicio = (TextView) findViewById(R.tv.EventoDataInicio); 
		tvDataTermino = (TextView) findViewById(R.tv.EventoDataTermino);
		tvHorario = (TextView) findViewById(R.tv.EventoHorario); 
		tvTipoEvento = (TextView) findViewById(R.tv.EventoTipoDeEvento);
		tvContato = (TextView) findViewById(R.tv.EventoContato);
		tvMaisInfo = (Button) findViewById(R.btn.EventoMaisInfo);
	}//fim do inicializarComponentes

	@Override
	public void definirEventos() {
		//Evento de colocar texto dentro dos campos
		tvLocal.setText("Local: " + this.getString(R.string.evento_local));
		tvDataInicio.setText("Data de início: " + this.getString(R.string.evento_data_inicio));
		tvDataTermino.setText("Data de término: " + this.getString(R.string.evento_data_termino));
		tvHorario.setText("Horário: " + this.getString(R.string.evento_horario));
		tvTipoEvento.setText("Tipo: " + this.getString(R.string.evento_tipo_de_evento));
		tvContato.setText("Contato: " + this.getString(R.string.evento_contato));
		
		tvMaisInfo.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.unb-ect.com.br")));
			}//fim do onClick
		});//fim do evento
	}//fim do definirEventos

}//fim da classe
