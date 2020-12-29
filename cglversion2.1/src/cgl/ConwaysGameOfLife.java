package cgl;

//import java.util.Scanner;

public class ConwaysGameOfLife {
	
	public static boolean[][] generateNextGeneration(int noofgenerations,boolean [][] current)
	{
		Board  b=new Board();
		int n=current.length,i,j;
		boolean[][] newBoard = new boolean[n][n]; 
		Cell c=new Cell();
		for(i=0;i<n;i++)
		{
            for(j=0;j<n;j++)
            {
                int ilives = c.countLiveCells(current, i, j); 
                boolean status=c.getStatus(current, i, j);

                if(status)
                {
                    if(ilives<2)
                    { 
                        newBoard[i][j]=false;
                    }
                    else if(ilives<=3)
                    {
                        newBoard[i][j]=true;
                    } 
                    else if(ilives>3)
                    {
                        newBoard[i][j]=false;
                    }
                }
                else{
                    if(ilives==3)
                    {
                        newBoard[i][j] = true;   
                    }
                }
                
                
            }
        }
		System.out.println(b.printBoard(newBoard));
		while(noofgenerations>1) 
		{
			
			newBoard=generateNextGeneration(1,newBoard);
			//System.out.println(b.printBoard(newBoard));
			noofgenerations--;
		}
		return newBoard;
	}
		
		//public static void main(String[] args)
		//{
			/*int l[][]= {{1,2},{1,3},{2,4},{3,2},{3,1},{1,4},{5,6},{5,5}};
			Board b=new Board();
			generateNextGeneration(3,b.createBoard(10, l));
			//b.createBoard(10,l);
			*/
			//int l[][]= {{6,8},{8,6},{2,4},{5,7}};
			//Board b=new Board();
			// System.out.println(b.printBoard(b.createBoard(10,l)));
	         //int l[][]= {{3,5},{4,6},{3,1},{2,6},{6,5},{4,4},{1,1},{2,5}};
	         //Board b=new Board();
	         //generateNextGeneration(3,b.createBoard(10, l));
	         //System.out.println(b.printBoard(b.createBoard(10,l)));
		//}
	}
	


