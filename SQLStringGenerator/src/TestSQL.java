import static org.junit.Assert.*;

import org.junit.Test;


public class TestSQL {

	@Test
	public void testSimpleSelect(){
		SQL sql = new SQL();
		
		String[] column = {"name"};
		assertEquals("select name from animal", sql.select("animal", column));
	}

	@Test
	public void testSelectWithMoreColumns(){
		SQL sql = new SQL();
		
		String[] column = {"name", "age", "phylum"};
		assertEquals("select name,age,phylum from animal", sql.select("animal", column));
	}
}
