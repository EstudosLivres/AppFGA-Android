package fga.modelo.value_object;

/**
 * 
 * @author ilton_unb
 *
 */

/** Classe resposn�vel por abstrair um evento **/
public class EventoVO {
	//Atributos
	public String nome, local, dataInicio, dataTermino, horarioInicio, horarioTermino, tipoDeEvento, contato, maisInfo, maisInfoLink;

	
	/**
	 * Construtor
	 * @param nome --> Nome do evento a ser realizado.
	 * @param local --> Local aonde acontecer� o evento.
	 * @param dataInicio --> Data de in�cio do evento.
	 * @param dataTermino --> Data de t�rmino do evento.
	 * @param horarioInicio --> Hor�rio que este ocorrer�.
	 * @param tipoEvento --> Tipo do evento, por exemplo simposio.
	 * @param contato --> A quem contactar em caso de duvidas ou suget�es.
	 * @param maisInfo --> Mais informa��es sobre o evento */
	public EventoVO(String nome, String local, String dataInicio,
			String dataTermino, String horarioInicio, String horarioTermino, String tipoDeEvento, String contato, String maisInfo) {
		
		this.nome = nome;
		this.local = local;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.horarioInicio = horarioInicio;
		this.horarioTermino = horarioTermino;
		this.tipoDeEvento = tipoDeEvento;
		this.contato = contato;
		this.maisInfo = maisInfo;
		
	}//fim do construtor

	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public String getHorarioTermino() {
		return horarioTermino;
	}

	public void setHorarioTermino(String horarioTermino) {
		this.horarioTermino = horarioTermino;
	}

	public String getTipoDeEvento() {
		return tipoDeEvento;
	}

	public void setTipoDeEvento(String tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getMaisInfo() {
		return maisInfo;
	}

	public void setMaisInfo(String maisInfo) {
		this.maisInfo = maisInfo;
	}
	
	public String getHorarioInfo(){
		return "Das " + this.horarioInicio + " �s " + this.horarioTermino;
	}
	
	public String getDataInfo(){
		return "De " + this.dataInicio + " at� " + this.dataTermino;
	}
	
}//fim da classe
