package fga.modelo.value_object;

/**
 * 
 * @author Ilton Garcia e Kanashiro
 *
 */

/** Classe respons�vel por instancia os contatos da FGA **/
public class ContatoTelefone {

	//Atributos
	String secretaria, cpd, direcao, administracao, coodernacaoGeral;
	
	/**
	 * Construtor padr�o
	 * @param secretaria --> Telefone da secretaria.
	 * @param cpd --> Telefone da CPD.
	 * @param direcao --> Telefone da dire��o.
	 * @param administracao --> Telefone da administra��o.
	 * @param coodernacaoGeral -->  Telefone da coordena��o geral. **/
	public ContatoTelefone(String secretaria, String cpd, String direcao, String administracao, String coodernacaoGeral) {
		this.secretaria = secretaria;
		this.cpd = cpd;
		this.direcao = direcao;
		this.administracao = administracao;
		this.coodernacaoGeral = coodernacaoGeral;
	}//fim do construtor

	public String getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}

	public String getCpd() {
		return cpd;
	}

	public void setCpd(String cpd) {
		this.cpd = cpd;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getAdministracao() {
		return administracao;
	}

	public void setAdministracao(String administracao) {
		this.administracao = administracao;
	}

	public String getCoodernacaoGeral() {
		return coodernacaoGeral;
	}

	public void setCoodernacaoGeral(String coodernacaoGeral) {
		this.coodernacaoGeral = coodernacaoGeral;
	}
	
}//fim da classe
