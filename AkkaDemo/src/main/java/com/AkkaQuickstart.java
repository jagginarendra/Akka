package com;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

import java.io.IOException;

import com.Greeter.*;

public class AkkaQuickstart {
	public static void main(String[] args) {
		
		final ActorSystem system = ActorSystem.create("helloakka");
		try {
			
			final ActorRef printerActor = system.actorOf(Printer.props(), "printerActor");
			final ActorRef howdyGreeter = system.actorOf(Greeter.props("Howdy", printerActor), "howdyGreeter");

			howdyGreeter.tell(new WhoToGreet("Akka"), ActorRef.noSender());
			howdyGreeter.tell(new Greet(), ActorRef.noSender());

			System.out.println(">>> Press ENTER to exit <<<");
			System.in.read();
		} catch (IOException ioe) {
		} finally {
			system.terminate();
		}
	}
}
