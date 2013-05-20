package modelo.persistence;

import java.util.List;

import org.hibernate.Session;

public class HibernateDAO<T> {

	protected Session sessao;
	private Class classe;

	public HibernateDAO(Class classe) {
		super();
		sessao = HibernateUtil.getSession();
		this.classe = classe;
	}

	public void salvar(T obj) { 
		sessao.beginTransaction();
		sessao.save(obj);
		sessao.getTransaction().commit();
	}

	public void alterar(T obj) {
		sessao.beginTransaction();
		sessao.update(obj);
		sessao.getTransaction().commit();	
	}

	public void deletar(T obj) {
		sessao.beginTransaction();
		sessao.delete(obj);
		sessao.getTransaction().commit();
	}

	public T getByID(Integer id) { 
	return (T) sessao.load(classe, id);
	}

	public List<T> listar() {
	return  sessao.createCriteria(classe).list() ;
	}

}