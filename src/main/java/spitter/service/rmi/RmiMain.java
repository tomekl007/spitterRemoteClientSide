package spitter.service.rmi;

import java.util.List;

import my.spitterP.mainP.Spitter;
import my.spitterP.mainP.SpitterService;
import my.spitterP.mainP.Spittle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiMain {
	
	/*@Autowired
	static
	SpitterService spitterService;
	*/
  public static void main(String[] args) {
    //ApplicationContext context = new ClassPathXmlApplicationContext("remote-service-context-2.xml");
    String userName="habuma";
    //Spitter spitter = spitterService.getSpitter(userName);
    //System.out.println( spitterService.getSpittlesForSpitter(spitter) );
    SpitterRmiClient src = new SpitterRmiClient();
    List<Spittle> spitters = src.getSpittles(userName);
    System.out.println(spitters);
  }
}
