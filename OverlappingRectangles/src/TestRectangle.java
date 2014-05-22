import static org.junit.Assert.*;

import org.junit.Test;


public class TestRectangle {

	@Test(expected=IllegalArgumentException.class)
	public void testCreateRectangleWithWrongXValues() {
		@SuppressWarnings("unused")
		Rectangle rec= new Rectangle(4.0, 5.0, 2.0, 9.0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCreateRectangleWithWrongYValues() {
		@SuppressWarnings("unused")
		Rectangle rec= new Rectangle(2.0, 9.0, 4.0, 5.0);
	}

	@Test
	public void testComputateArea(){
		Rectangle rec = new Rectangle(0.0, 0.0, 5.0, 5.0);
		
		assertEquals(25.0, rec.calcArea(), 0.1);
	}
	
	@Test
	public void testComputateCircumference(){
		Rectangle rec = new Rectangle(0.0, 0.0, 5.0, 5.0);
		
		assertEquals(20.0, rec.calcCircumference(), 0.1);
	}
	
	@Test
	public void testCheckOverlappingWithOverlappingSameRectangle(){
		Rectangle rec1 = new Rectangle(0.0, 0.0, 1.0, 1.0);
		Rectangle rec2 = new Rectangle(0.0, 0.0, 1.0, 1.0);
		
		assertTrue(rec1.checkOverlapping(rec2));
	}
	
	@Test
	public void testCheckOverlappingWithLeftOverlapping(){
		Rectangle rec1 = new Rectangle(0.0, 0.0, 1.0, 1.0);
		Rectangle rec2 = new Rectangle(-1.0, 0.0, 0.5, 1.0);
		
		assertTrue(rec1.checkOverlapping(rec2));
	}
	
	@Test
	public void testCheckOverlappingWithRightOverlapping(){
		Rectangle rec1 = new Rectangle(0.0, 0.0, 1.0, 1.0);
		Rectangle rec2 = new Rectangle(0.5, 0.0, 2.0, 1.0);
		
		assertTrue(rec1.checkOverlapping(rec2));
	}
	
	@Test
	public void testCheckOverlappingWithTopOverlapping(){
		Rectangle rec1 = new Rectangle(0.0, 0.0, 1.0, 1.0);
		Rectangle rec2 = new Rectangle(0.5, 0.5, 1.5, 2.0);
		
		assertTrue(rec1.checkOverlapping(rec2));
	}
	
	@Test
	public void testCheckOverlappingWithDownOverlapping(){
		Rectangle rec1 = new Rectangle(0.0, 0.0, 1.0, 1.0);
		Rectangle rec2 = new Rectangle(-0.5, -0.5, 0.5, 0.5);
		
		assertTrue(rec1.checkOverlapping(rec2));
	}
	
	@Test
	public void testCheckOverlappingWithoutOverlapping(){
		Rectangle rec1 = new Rectangle(0.0, 0.0, 1.0, 1.0);
		Rectangle rec2 = new Rectangle(2.0, 3.0, 3.0, 4.0);
		
		assertFalse(rec1.checkOverlapping(rec2));
	}
	
	@Test
	public void testCheckOverlappingWithOnePointOverlapping(){
		Rectangle rec1 = new Rectangle(0.0, 0.0, 1.0, 1.0);
		Rectangle rec2 = new Rectangle(-0.5, -0.5, 0.0, 0.0);
		
		assertTrue(rec1.checkOverlapping(rec2));
	}
	
	@Test
	public void testCheckOverlappingWithOneSideOverlapping(){
		Rectangle rec1 = new Rectangle(0.0, 0.0, 1.0, 1.0);
		Rectangle rec2 = new Rectangle(-0.5, -0.5, 0.0, 0.5);
		
		assertTrue(rec1.checkOverlapping(rec2));
	}
	
	@Test
	public void testCheckOverlappingWithInsideOverlapping(){
		Rectangle rec1 = new Rectangle(0.0, 0.0, 1.0, 1.0);
		Rectangle rec2 = new Rectangle(0.1, 0.1, 0.5, 0.5);
		
		assertTrue(rec1.checkOverlapping(rec2));
	}
	
	@Test
	public void testCheckOverlappingWithOutsideOverlapping(){
		Rectangle rec1 = new Rectangle(0.0, 0.0, 1.0, 1.0);
		Rectangle rec2 = new Rectangle(-0.5, 0.5, 2.0, 1.5);
		
		assertTrue(rec1.checkOverlapping(rec2));
	}
}
