
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

	public Object update(String string, String[] column, String[] value,
			String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}

}
