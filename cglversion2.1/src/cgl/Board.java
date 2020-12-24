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
	public String printBoard(boolean board[][]) 
	{
		StringBuffer a = new StringBuffer();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j])
                {
                    a.append("*");
                    //System.out.print(".");
                    //System.out.print(" ");
                }
                else
                {
                    a.append(".");
                    //System.out.print("*");
                    //System.out.print(" ");
                }
                //if(j<board[0].length-1)
                //{
                  //  System.out.print(" ");
                //}
            }
            a.append("\n");
            //System.out.println();
        }
       return a.toString();
	}
}
