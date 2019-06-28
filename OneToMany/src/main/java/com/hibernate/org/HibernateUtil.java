package com.hibernate.org;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory session = buildSessionFactory();
	private static SessionFactory buildSessionFactory() {
		// TODO Auto-generated method stub
		try {
			Configuration config = new AnnotationConfiguration().configure();
			return config.buildSessionFactory();
		}catch(Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
		
	}
		public static SessionFactory getSessionFactory() {
			return session;
			
		}
		public static void shutdown() {
			getSessionFactory().close();
		}
		
}
