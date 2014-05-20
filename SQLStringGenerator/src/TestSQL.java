import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestSQL {

	private SQL sql;
	
	@Before
	public void setUp(){
		this.sql = new SQL();
	}
	
	@Test
	public void testSimpleSelect(){
		String[] column = {"name"};
		assertEquals("select name from animal", sql.select("animal", column));
	}

	@Test
	public void testSelectWithMoreColumns(){
		String[] column = {"name", "age", "phylum"};
		assertEquals("select name,age,phylum from animal", sql.select("animal", column));
	}
	
}
