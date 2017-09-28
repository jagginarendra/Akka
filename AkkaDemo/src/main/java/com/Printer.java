package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

//#printer-messages
public class Printer extends AbstractActor {
	// #printer-messages
	static public Props props() {
		return Props.create(Printer.class, () -> new Printer());
	}

	// #printer-messages
	static public class Greeting {
		public final String message;

		public Greeting(String message) {
			this.message = message;
		}
	}

	public Printer() {
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder().match(Greeting.class, greeting -> {

			System.out.println("hello");
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = factory.openSession();
			session.beginTransaction();
			//@SuppressWarnings("unchecked")
			//List<Order> orderList = (List<Order>)session.createQuery("FROM Order").list();
			
			session.get("123", Order.class);
			session.close();

		}).build();
	}
	// #printer-messages
}
// #printer-messages
