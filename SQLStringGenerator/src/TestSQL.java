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
	
	@Test
	public void testSimpleUpdate(){
		String[] column = {"name"};
		String[] value = {"dog"};
		String[] select = {"name", "cat"};
		
		assertEquals("update animal set name='dog' where name='cat'",
				this.sql.update("animal", column, value, select));
	}
	
	@Test
	public void testUpdateWithMoreColumns(){
		String[] column = {"name", "age"};
		String[] value = {"dog", "5"};
		String[] select = {"name", "cat", "age", "10"};
		
		assertEquals("update animal set name='dog',age='5' where name='cat' and age='10'",
				this.sql.update("animal", column, value, select));
	}
	
	@Test
	public void testSimpleDelete(){
		String[] select = {"name", "cat"};
		
		assertEquals("delete from animal where name='cat'",
				this.sql.delete("animal", select));
	}
	
	@Test
	public void testDeleteWithMoreColumns(){
		String[] select = {"name", "cat", "age", "10"};
		
		assertEquals("delete from animal where name='cat' and age='10'",
				this.sql.delete("animal", select));
	}
}
