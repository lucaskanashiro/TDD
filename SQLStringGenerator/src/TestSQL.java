import static org.junit.Assert.*;

import org.junit.Test;


public class TestSQL {

	@Test
	public void testSimpleSelect(){
		SQL sql = new SQL();
		
		String[] column = {"name"};
		assertEquals("select name from animal", sql.select("animal", column));
	}

}
