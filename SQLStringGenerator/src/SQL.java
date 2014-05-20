
public class SQL {

	public String select(String table, String[] column) {
		String command_sql = "select ";
		
		if(column.length == 1)
			command_sql += column[0];
		else{
			for(int i=0; i<column.length-1; i++)
				command_sql += column[i] + ",";
			command_sql += column[column.length-1];
		}
		
		command_sql += " from " + table;
		
		return command_sql;
	}

}
