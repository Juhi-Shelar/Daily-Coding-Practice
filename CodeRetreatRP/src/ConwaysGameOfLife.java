public class ConwaysGameOfLife{
	
	int grid[][];
	int gridSize = 0;
	
	public ConwaysGameOfLife(int size, int initGrid[][]) {
		gridSize = size;
		grid = initGrid;
	}
	
	public int getCountOfAliveNeighbour(int rowId, int colId) {
		int countOfNeighbour = 0;
		int i,j;
		
		if(rowId-1 < 0)
			i = rowId;
		else
			i = rowId-1;
		
		for(; i<=rowId+1 && i>=0 && i<gridSize; i++) {
			if(colId-1 < 0)
				j = colId;
			else
				j = colId-1;
			
			for(; j<=colId+1 && j>=0 && j<gridSize; j++) 
				if(grid[i][j]==1) 
					countOfNeighbour++;
		}
		
		if(grid[rowId][colId]==1)
			return countOfNeighbour-1;
		else
			return countOfNeighbour;
	}
	
	

	public static void main(String[] args) {

		int tempGrid[][] = {
				{0,1,0},
				{0,1,1},
				{0,0,0}
		};
		
		ConwaysGameOfLife obj = new ConwaysGameOfLife(3, tempGrid);
		System.out.println(obj.getCountOfAliveNeighbour(0, 0));
	}
}