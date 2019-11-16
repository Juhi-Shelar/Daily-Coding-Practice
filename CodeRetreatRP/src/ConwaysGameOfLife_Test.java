import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ConwaysGameOfLife_Test {
	@Test
	void Test_getCountOfNeigh() {
		int tempGrid[][] = {
				{0,1,0},
				{0,1,1},
				{0,0,0}
		};
		ConwaysGameOfLife obj = new ConwaysGameOfLife(3, tempGrid);
		
		assertEquals(2, obj.getCountOfAliveNeighbour(0,0));
		
		assertEquals(2, obj.getCountOfAliveNeighbour(2,2));
	} 
	
	

}
