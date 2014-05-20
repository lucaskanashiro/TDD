
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

	public String insert(String table, String[] column, String[] value) {
		String command_sql = "insert into ";
		
		command_sql += table + " (";
		
		if(column.length == 1)
			command_sql += column[0];
		else{
			for(int i=0; i<column.length-1; i++)
				command_sql += column[i] + ",";
			command_sql += column[column.length-1];
		}
		
		command_sql += ") values (";
		
		if(value.length == 1)
			command_sql += value[0];
		else{
			for(int i=0; i<value.length-1; i++)
				command_sql += value[i] + ",";
			command_sql += value[value.length-1];
		}
		
		command_sql += ")";
		
		return command_sql;
	}

}
