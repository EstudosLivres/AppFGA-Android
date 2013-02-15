package fga.grafico;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import fga.controller.ActivityContatoController;
/**
 * 
 * @author Ilton Garcia e Kanashiro
 *
 */
import fga.grafico.superclasses.AbstractActivity;

/** Classe responsável por tratar a tela do contato **/
public class ContatoActivity extends AbstractActivity {
	
	//Atributos
	TextView tvTelSecretaria, tvTelCPD, tvTelDirecao, tvTelAdm, tvTelCoodernacao;
	ActivityContatoController controller;

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contatos);
		
        //Instanciação do controller
        controller = ActivityContatoController.getInstance();
		inicializarComponentes();
		definirEventos();
	}//fim do onCreate
	
	@Override
	public void inicializarComponentes() {
		//Puxando do xml
		tvTelSecretaria = (TextView) findViewById(R.tv.ContatoSecretaria); 
		tvTelCPD = (TextView) findViewById(R.tv.ContatoCPD); 
		tvTelDirecao = (TextView) findViewById(R.tv.ContatoDirecao); 
		tvTelAdm = (TextView) findViewById(R.tv.ContatoAdministracao);
		tvTelCoodernacao = (TextView) findViewById(R.tv.ContatoCoodGeral);
		
		//Jogando os textos na tela
		tvTelSecretaria.setText(this.getString(R.string.contato_secretaria) + " " + controller.telefones.getSecretaria());
		tvTelCPD.setText(this.getString(R.string.contato_cpd) + " " + controller.telefones.getCpd());
		tvTelDirecao.setText(this.getString(R.string.contato_direcao) + " " + controller.telefones.getDirecao());
		tvTelAdm.setText(this.getString(R.string.contato_administracao) + " " + controller.telefones.getAdministracao());
		tvTelCoodernacao.setText(this.getString(R.string.contato_cood_geral) + " " + controller.telefones.getCoodernacaoGeral());
	}//fim do inicializarComponentes

	@Override
	public void definirEventos() {
		//Adicionando eventos textviews
		tvTelSecretaria.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//Uri com o numero para o qual vamos ligar
				Uri uri = Uri.parse("tel:" + controller.telefones.getSecretaria());
				//Criar a intent de ir para a ligação
				Intent it = new Intent(Intent.ACTION_CALL, uri);
				startActivity(it);
			}//fim do onclick
		});//fim do evento sobre o textview
		
		tvTelCPD.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//Uri com o numero para o qual vamos ligar
				Uri uri = Uri.parse("tel:" + controller.telefones.getSecretaria());
				//Criar a intent de ir para a ligação
				Intent it = new Intent(Intent.ACTION_CALL, uri);
				startActivity(it);
			}//fim do onclick
		});//fim do evento sobre o textview
		
		tvTelDirecao.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//Uri com o numero para o qual vamos ligar
				Uri uri = Uri.parse("tel:" + controller.telefones.getSecretaria());
				//Criar a intent de ir para a ligação
				Intent it = new Intent(Intent.ACTION_CALL, uri);
				startActivity(it);
			}//fim do onclick
		});//fim do evento sobre o textview
		
		tvTelAdm.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//Uri com o numero para o qual vamos ligar
				Uri uri = Uri.parse("tel:" + controller.telefones.getSecretaria());
				//Criar a intent de ir para a ligação
				Intent it = new Intent(Intent.ACTION_CALL, uri);
				startActivity(it);
			}//fim do onclick
		});//fim do evento sobre o textview 
		
		tvTelCoodernacao.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//Uri com o numero para o qual vamos ligar
				Uri uri = Uri.parse("tel:" + controller.telefones.getSecretaria());
				//Criar a intent de ir para a ligação
				Intent it = new Intent(Intent.ACTION_CALL, uri);
				startActivity(it);
			}//fim do onclick
		});//fim do evento sobre o textview
		
	}//fim do definirEventos

}//fim da classe
