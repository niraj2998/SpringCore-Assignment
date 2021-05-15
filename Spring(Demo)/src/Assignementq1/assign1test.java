package Assignementq1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class assign1test {
	
	ArrayList a=new ArrayList();
	ArrayList b=new ArrayList();

	@Test
	void test() {
	
		Addresses ada=new Addresses("yallama mandir","solapur","maharshtra", "413005", "india");
		Customer cu=new Customer(1,"Navin","9579118286",ada);
		
		a.add("Navin");
		a.add("9579118286");
		a.add("yallama mandir");
		a.add("solapur");
		a.add("maharshtra");
		a.add("413005");
		a.add("india");
	
		
		
	Object navin=cu;
	
	b=(ArrayList)navin;
	
	    assertEquals(b, a);
	}

}
