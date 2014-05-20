
public class SQL {

	public String select(String table, String[] column) {
		String command_sql = "select ";
		
		for(int i=0; i<column.length; i++)
			command_sql += column[i];
		
		command_sql += " from " + table;
		
		return command_sql;
	}

}
