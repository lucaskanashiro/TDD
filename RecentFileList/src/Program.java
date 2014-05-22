import java.util.ArrayList;


public class Program {
	
	private ArrayList<String> recentFileList;
	
	public Program(){
		this.recentFileList = new ArrayList<String>();
	}
	
	public void openFile(String fileName) {
		if(fileName == null || fileName.isEmpty())
			throw new IllegalArgumentException();
		
		this.recentFileList.add(fileName);
	}

	public String getRecentFileList() throws RecentFileNullException {
		if(this.recentFileList.isEmpty())
			throw new RecentFileNullException();
		
		String list="";
		
		for(int index=0; index<this.recentFileList.size(); index++){
			if(index == this.recentFileList.size()-1)
				list += this.recentFileList.get(index);
			else
				list += this.recentFileList.get(index) + " ";
		}
		
		return list;
	}

}
