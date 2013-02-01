package fga.interfaces;

/**
 * 
 * @author Ilton Garcia
 *
 */

/** Define o comportamento de transmissão de notícias **/
public interface FeedNoticia extends WebServiceInterface{
	
	/** Responsável pelo envio de notificação quando há nova noticia, bem como quando alguma notícia esperada, por exemplo sobre greve. **/
	public void enviarNotificacao();
	
	/** Responsável pelo redirecionamento quando alguma notifica gerar link externo, por exemplo. **/
	public void direcionamentoLinkNoticia();
	
}
