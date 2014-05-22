import java.util.ArrayList;


public class Program {
	
	private ArrayList<String> recentFileList;
	
	public Program(){
		this.recentFileList = new ArrayList<String>();
	}
	
	public void openFile(String fileName) {
		if(fileName == null || fileName.isEmpty())
			throw new IllegalArgumentException();
		
		boolean findEqual=false;
		int indexSameFile = 0;
		
		for(int index=0; index<this.recentFileList.size(); index++){
			if(fileName.equals(this.recentFileList.get(index))){
				findEqual=true;
				indexSameFile = index;
				break;
				
			}
		}
		
		if(this.recentFileList.size() == 15 && !findEqual ){
			this.recentFileList.remove(0);
			this.recentFileList.add(fileName);
		} else if(findEqual){
			this.recentFileList.remove(indexSameFile);
			this.recentFileList.add(0, fileName);
		} else
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
