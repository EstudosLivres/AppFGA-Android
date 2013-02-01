package fga.interfaces;

/**
 * 
 * @author Ilton Garcia
 * Data do primeiro coment�rio: 04/09
 */

/** Interface que define o comportamento da rotina de persist�ncia com o banco de dados **/
public interface CRUD_DAO {
	
	/** M�todo respons�vel por cadastrar objetos no BD **/
	public void cadastrar(Object obj);
	
	/** M�todo respons�vel por pesquisar objetos no BD **/
	public Object pesquisar(String proposicao);
	
	/** M�todo respons�vel por atualizar objetos no BD **/
	public void atualizar(Object objetoAntigo, Object objetoAtualizado);
	
	/** M�todo respons�vel por deletar objetos no BD **/
	public void deletar(Object objeto);
	
}
