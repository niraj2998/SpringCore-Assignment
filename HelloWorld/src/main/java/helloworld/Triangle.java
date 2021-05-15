package helloworld;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Triangle implements Drawone {
     
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("print triangle");
		
	}

	

}
