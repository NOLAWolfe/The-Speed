package com.wolfe.speed.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (HibernateUtil.sessionFactory == null) {
			Configuration c = new Configuration();
			c.setProperty("hibernate.connection.username", System.getenv("Demo_DB_User"));
			c.setProperty("hibernate.connection.password", System.getenv("Demo_DB_Pass"));
			c.setProperty("hibernate.connection.url", System.getenv("Demo_DB_URL"));
			c.configure(); // :: "hibernate.cfg.xml" :: by default, looks for hibernate.cfg.xml in
							// src/main/resources
			HibernateUtil.sessionFactory = c.buildSessionFactory();
		}
		return HibernateUtil.sessionFactory;
	}

}
