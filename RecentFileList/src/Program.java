import java.util.ArrayList;


public class Program {
	
	private ArrayList<String> recentFileList;
	
	public Program(){
		this.recentFileList = new ArrayList<String>();
	}
	
	public void openFile(String fileName) {
		if(fileName == null || fileName.isEmpty())
			throw new IllegalArgumentException();
		
	}

	public void getRecentFileList() throws RecentFileNullException {
		if(this.recentFileList.isEmpty())
			throw new RecentFileNullException();
	}

}
