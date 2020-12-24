package cgl;

//import java.util.Scanner;

public class ConwaysGameOfLife {
	public void generateNextGeneration()
	{
		
	}
	public static boolean[][] generateNextGeneration(boolean [][] current)
	{
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
		return newBoard;
	}
		
		public static void main(String[] args)
		{
			int l[][]= {{1,2},{2,6},{4,5},{6,3}};
			Board b=new Board();
			b.createBoard(10,l);
		}
	}
	


