//package com.in.skill.controller;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.in.skill.model.Customer;
//
//@Controller
//public class CutomerController {
//	
//	Configuration config = new Configuration();
//	SessionFactory sessionFactory = config.buildSessionFactory();
//
//	@RequestMapping("/add")
//	public String save(Customer customer, Model model) {
//
//		// create session factory
//
//		// initalize the session object
//		Session session = sessionFactory.openSession();
//
//		System.out.println("Hello World!");
//		Customer song = new Customer();
////		song.setId(2);
//		song.setId(3);
//		song.setFirstName("song 3");
//		song.setLastName("unknow 3");
//		song.setEmail("unknow 3");
//
//		session.beginTransaction();
//		session.saveOrUpdate(song);
//		session.getTransaction().commit();
//
//		System.out.println("Song saved");
//
//		return "done";
//	}
//
//}