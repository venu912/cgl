package cgl;

public class Cell
{
	public boolean getStatus(boolean[][] current, int i,int j)
	{
		if(current[i][j])
		{
			return true;
		}
		return false;
	}
	public int countLiveCells(boolean[][] current,int x,int y)  
    {
		int i,j;
        int lives=0;
        for(i=x-1;i<=x+1;i++)
        {
            for(j=y-1;j<=y+1;j++)
            {
                if(i!=x || j!=y){
                    if(i>=0 && i<current.length && j>=0 && j<current.length && current[i][j])
                    {
                        lives+=1;
                    }
                }
            }
        }
        return lives;
    }
	
}
