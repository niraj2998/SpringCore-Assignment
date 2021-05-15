package helloworld;

import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Circle implements Drawone{

	public void Draw() {
		System.out.println("drawing Circle");
		
	}

	
	
	
	

}
