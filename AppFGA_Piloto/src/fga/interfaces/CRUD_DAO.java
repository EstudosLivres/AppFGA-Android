package fga.interfaces;

/**
 * 
 * @author Ilton Garcia
 * Data do primeiro comentário: 04/09
 */

/** Interface que define o comportamento da rotina de persistência com o banco de dados **/
public interface CRUD_DAO {
	
	/** Método responsável por cadastrar objetos no BD **/
	public void cadastrar(Object obj);
	
	/** Método responsável por pesquisar objetos no BD **/
	public Object pesquisar(String proposicao);
	
	/** Método responsável por atualizar objetos no BD **/
	public void atualizar(Object objetoAntigo, Object objetoAtualizado);
	
	/** Método responsável por deletar objetos no BD **/
	public void deletar(Object objeto);
	
}
