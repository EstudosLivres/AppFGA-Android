package fga.interfaces.superclasses;

/*
import fga.modelo.MensagemWS;

/**
 * @author Ilton Garcia
 * Data do primeiro coment�rio: 04/09
 */

/** Interface que define o comportamento de intera��o com o WebService (de modo mais geral) **/
public interface WebServiceInteracao {
	
	/** M�todo respons�vel por criar a mensagem que deve ser enviada ao servidor **/
/*	public MensagemWS criarMensagem();
	
	/** M�todo respons�vel por enviar a mensagem ao servidor **/
/*	public void setMensagem(MensagemWS msgCriada);
	
	/** M�todo respons�vel por obter uma resposta de sinal do servidor **/
	public boolean getRespostaSinal();
	
	/** M�todo respons�vel por obter a respota do servidor, com o XML **/
	public Class<?> getResposta();

}
