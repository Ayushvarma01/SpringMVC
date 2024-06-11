package com.first.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		// create configurtatioon
		Configuration config = new Configuration();
		config.configure("hibernateconfiguration.cfg.xml");
		config.addAnnotatedClass(Song.class);
		// create session factory
		SessionFactory sessionFactory = config.buildSessionFactory();

		// initalize the session object
		Session session = sessionFactory.openSession();

		System.out.println("Hello World!");
		Song song = new Song();
//		song.setId(2);
		song.setSongName("song 3");
		song.setArtist("unknow 3");

		session.beginTransaction();
		session.saveOrUpdate(song);
		session.getTransaction().commit();

		System.out.println("Song saved");
	}
}
