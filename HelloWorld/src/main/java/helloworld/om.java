package helloworld;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.*;
import javax.inject.Inject;

@Component
public class om implements InitializingBean,DisposableBean {
	//@Autowired
	//@Resource(name="triangle")
   @Inject
	public Drawone Draw1;

public void navin()
{
	Draw1.Draw();
      
}

@PostConstruct
public  void postconstuct()
{  
	System.out.println("post constuct");
	
}

public void afterPropertiesSet() throws Exception {
	System.out.println("intit using implements");
	
}

public void destroy() throws Exception {
	System.out.println("dispo");
	
}


@PreDestroy
public void predestory()
{
	System.out.println("Destory");


}


public void myinit()

{
	System.out.println("using init");

}

public void mydestroy()
{
	
    System.out.println("using destroy");
}
	

}
