package helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainDraw {

	public static void main(String[] args) {
		
		//Drawone d=new Circle();
		//d.Draw();
		

		AbstractApplicationContext context12= new ClassPathXmlApplicationContext("new.xml");
		
	      context12.registerShutdownHook();
		om  n =(om) context12.getBean("om");
		
		n.navin();

	}

}
