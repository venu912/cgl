package cgl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit {

   @Test
   public void testCglOne() {
	   int l[][]= {{6,8},{8,6},{2,4},{5,7}};
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
   
   @Test
   public void testCglThree() {
	   int l[][]= {{1,2},{1,3},{2,4},{3,2},{3,1},{1,4},{5,6},{5,5}};
	   Board b=new Board();
	   //ConwaysGameOfLife cgl=new ConwaysGameOfLife();
	   
	   System.out.println("======TEST TWO EXECUTED=======");
       Assertions.assertEquals("...**.....\n"
       		+ "..***.....\n"
       		+ "...**.....\n" 
       		+ "..........\n"
       		+ "..........\n"
       		+ "..........\n"
       		+ "..........\n"
       		+ "..........\n"
       		+ "..........\n"
       		+ "..........\n",b.printBoard(ConwaysGameOfLife.generateNextGeneration(2,b.createBoard(10,l)))); 
   }
   /*@Test
   public void testCglSeven() {
	   int l[][]= {{3,5},{4,6},{3,1},{2,6},{6,5},{4,4},{1,1},{2,5}};
	   Board b=new Board();
	   //ConwaysGameOfLife cgl=new ConwaysGameOfLife();
	   
	   System.out.println("======TEST TWO EXECUTED=======");
	   Assertions.assertEquals("..........\n"
	   		+ ".*........\n"
	   		+ ".....**...\n"
	   		+ ".*...*....\n"
	   		+ "....*.*...\n"
	   		+ "..........\n"
	   		+ ".....*....\n"
	   		+ "..........\n"
	   		+ "..........\n"
	   		+ "..........\n",b.printBoard(ConwaysGameOfLife.generateNextGeneration(2,b.createBoard(10,l))));
   }*/
   
   
   @Test
   public void testCglFour() {
	   int l[][]= {{6,8},{8,6},{2,4},{5,7}};
	   Board b=new Board();
	   //ConwaysGameOfLife cgl=new ConwaysGameOfLife(); 
	   //cgl.generateNextGeneration(b.createBoard(10,l));
	   System.out.println("======TEST THREE EXECUTED=======");
	   Assertions.assertEquals("..........\n"
	   		+ "..........\n"
	   		+ "....*.....\n"
	   		+ "..........\n"
	   		+ "..........\n"
	   		+ ".......*..\n"
	   		+ "........*.\n"
	   		+ "..........\n"
	   		+ "......*...\n"
	   		+ "..........\n",b.printBoard(b.createBoard(10,l)));
	   
	   
   }
   @Test
   public void testCglFive() {
	   int l[][]= {{6,8},{8,6},{2,4},{5,7}};
	   Board b=new Board();
	   Cell c=new Cell();
	   System.out.println("======TEST FOUR EXECUTED======");
	   Assertions.assertEquals(true,c.getStatus(b.createBoard(10, l), 2,4));
   }
   
   @Test
   public void testCglSix() {
	   int l[][]= {{6,8},{8,6},{2,4},{5,7}};
	   Board b=new Board();
	   Cell c=new Cell();
	   System.out.println("======TEST FIVE EXECUTED======");
	   Assertions.assertEquals(false,c.getStatus(b.createBoard(10, l), 3,9));
   }
}