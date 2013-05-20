package modelo.persistence;

import modelo.Categoria;

public class CategoriaDAO extends HibernateDAO<Categoria> {

	public CategoriaDAO() {
		super(Categoria.class);
	}

}
