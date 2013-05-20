package modelo.persistence;

import modelo.Cliente;




public class ClienteDAO extends HibernateDAO<Cliente> {

	public ClienteDAO() {
		super(Cliente.class);
	}
	
}
