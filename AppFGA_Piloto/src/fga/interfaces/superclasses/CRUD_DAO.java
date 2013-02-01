package fga.interfaces.superclasses;

/**
 * 
 * @author Ilton Garcia
 * Data do primeiro coment‡rio: 04/09
 */
public interface CRUD_DAO {
	
	public void cadastrar(Object obj);
	public Object pesquisar(String proposicao);
	public void atualizar(Object objetoAntigo, Object objetoAtualizado);
	public void deletar(Object objeto);
	
}
