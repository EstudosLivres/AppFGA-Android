package fga.interfaces;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Define o comportamento de transmiss�o de not�cias **/
public interface FeedNoticia extends WebServiceInterface{
	
	/** Respons�vel pelo envio de notifica��o quando h� nova noticia, bem como quando alguma not�cia esperada, por exemplo sobre greve. **/
	public void enviarNotificacao();
	
	/** Respons�vel pelo redirecionamento quando alguma notifica gerar link externo, por exemplo. **/
	public void direcionamentoLinkNoticia();
	
}
