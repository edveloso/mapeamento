package visao;

import modelo.Categoria;
import modelo.Cliente;
import modelo.persistence.CategoriaDAO;
import modelo.persistence.ClienteDAO;
import modelo.persistence.HibernateDAO;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Categoria categoria = new Categoria();
		categoria.setTipo("comum");
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.salvar(categoria);
		
//		Cliente cliente = new Cliente();
//		cliente.setIdade(15l);
//		cliente.setNome("ana");
//		Categoria categoria = new Categoria();
//		categoria.setTipo("as novinha");
//		cliente.setCategoria(categoria);
//		
//		ClienteDAO clienteDAO = new ClienteDAO();
//		clienteDAO.salvar(cliente);
		
		
		
		
	}

}
