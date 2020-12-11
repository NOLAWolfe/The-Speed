package com.speed.utils

import org.hibernate.SessionFactory
import org.hibernate.cfg.Configuration


class HibernateUtil {
    static SessionFactory sessionFactory

    static SessionFactory getSessionFactory(){
        if (HibernateUtil.sessionFactory == null) {
            Configuration c = new Configuration()
            c.setProperty("hibernate.connection.username", System.getenv("Demo_DB_User"))
            c.setProperty("hibernate.connection.password", System.getenv("Demo_DB_Pass"))
            c.setProperty("hibernate.connection.url", System.getenv("Demo_DB_URL"))
            c.configure(); // :: "hibernate.cfg.xml" :: by default, looks for hibernate.cfg.xml in
            // src/main/resources
            HibernateUtil.sessionFactory = c.buildSessionFactory()
        }
        HibernateUtil.sessionFactory
    }
}
