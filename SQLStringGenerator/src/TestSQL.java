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
		assertEquals("select name from animal", this.sql.select("animal", column));
	}

	@Test
	public void testSelectWithMoreColumns(){
		String[] column = {"name", "age", "phylum"};
		assertEquals("select name,age,phylum from animal", this.sql.select("animal", column));
	}
	
	@Test
	public void testSimpleInsert(){
		String[] column = {"name"};
		String[] value = {"dog"};
		
		assertEquals("insert into animal (name) values (dog)", this.sql.insert("animal", column, value));
	}
	
	@Test
	public void testInsertWithMoreColumns(){
		String[] column = {"name", "age", "phylum"};
		String[] value = {"dog", "10", "mammalia"};
		
		assertEquals("insert into animal (name,age,phylum) values (dog,10,mammalia)", 
				this.sql.insert("animal", column, value));
	}
}
