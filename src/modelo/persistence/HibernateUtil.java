package modelo.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	static{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public static Session getSession(){
		return sessionFactory.openSession();
	}
}
