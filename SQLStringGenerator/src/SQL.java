
public class SQL {

	public String select(String table, String[] column) {
		String command_sql = "select ";
		
		command_sql += this.printValuesInArray(column);
		
		command_sql += " from " + table;
		
		return command_sql;
	}

	public String insert(String table, String[] column, String[] value) {
		String command_sql = "insert into ";
		
		command_sql += table + " (";

		command_sql += this.printValuesInArray(column);
		
		command_sql += ") values (";
		
		command_sql += this.printValuesInArray(value);
		
		command_sql += ")";
		
		return command_sql;
	}
	
	private String printValuesInArray(String[] value){
		String result="";
		
		if(value.length == 1)
			result += value[0];
		else{
			for(int i=0; i<value.length-1; i++)
				result += value[i] + ",";
			result += value[value.length-1];
		}
		
		return result;
	}

	public String update(String table, String[] column, String[] value, String[] select) {
		String command_sql = "update ";
		
		command_sql += table + " set " + column[0] + "='" + value[0] + 
				"' where " + select[0] + "='" + select[1] + "'";
		
		return command_sql;
	}

}
