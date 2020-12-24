package cgl;

public class Board {
	public boolean[][] createBoard(int n,int liveCells[][])
	{
		if(n>0)
		{
			boolean gameBoard[][]=new boolean[n][n];
			for(int i=0;i<liveCells.length;i++)
	        {
	            int l=liveCells[i][0];
	            int m=liveCells[i][1];
	            gameBoard[l][m]=true;
	        }
			return gameBoard;
		}
		else
		{
			return null;
		}
		
		
		
		 
	}
	public void printBoard(boolean board[][])
	{
		for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j]==false)
                {
                	System.out.print(".");
                }
                else
                {
                	System.out.print("*");
                }
            }
            System.out.println();
		
	}
	}
}
