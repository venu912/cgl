package CGL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit {
	public void testComplexNumberOne() {
		   ComplexNumber cn1 = new ComplexNumber(3, 4);
		   ComplexNumber cn2 = new ComplexNumber(3, -8);
	       System.out.println("======TEST ONE EXECUTED=======");
	       Assertions.assertEquals("6.0 - 4.0i", cn1.add(cn2).toString());
	   }
	   
	   @Test
	   public void testComplexNumberTwo() {
		   ComplexNumber cn1 = new ComplexNumber(3, 4);
		   ComplexNumber cn2 = new ComplexNumber(4, -1);
		   System.out.println("======TEST TWO EXECUTED=======");
	       Assertions.assertEquals("16.0 + 13.0i", cn1.multiply(cn2).toString());
	   }
	   
	   @Test
	   public void testComplexNumberThree() {
		   ComplexNumber cn1 = new ComplexNumber(3, 4);
		   ComplexNumber cn2 = new ComplexNumber(5, 6);
		   System.out.println("======TEST THREE EXECUTED=======");
	       Assertions.assertEquals("-2.0 - 2.0i", cn1.subtract(cn2).toString());
	   }

}
