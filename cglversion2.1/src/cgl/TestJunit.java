package cgl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit {

   @Test
   public void testCglOne() {
	   int l[][]= {{1,2},{2,6},{4,5},{6,3}};
	   Board b=new Board();
       System.out.println("======TEST ONE EXECUTED=======");
       Assertions.assertEquals(null,b.createBoard(-10,l));
   }
   
   @Test
   public void testCglTwo() {
	   int l[][]= {{1,2},{2,1}};
	   Board b=new Board();
	   System.out.println("======TEST TWO EXECUTED=======");
       Assertions.assertEquals(null,b.createBoard(0,l));
   }
   
  /* @Test
   public void testCglThree() {
	   ConwaysGameOfLife cgl=new ConwaysGameOfLife();
	   cgl.generateNextGeneration(cgl.createBoard(m));
	   System.out.println("======TEST THREE EXECUTED=======");
	   Assertions.assertEquals("Next Generation created successfully",cgl.generateNextGeneration());
   }*/
}