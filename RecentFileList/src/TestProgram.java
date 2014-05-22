import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestProgram {

	private Program prog;
	
	@Before
	public void setUp(){
		this.prog = new Program();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testOpenFileWithNullFileName() {
		this.prog.openFile(null);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testOpenFileWithBlankedStringFileName() {
		this.prog.openFile("");
	}
	
	@Test(expected=RecentFileNullException.class)
	public void testReturnOfRecentFileListWithoutFileOpened() throws RecentFileNullException{
		this.prog.getRecentFileList();
	}
	
	@Test
	public void testReturnOfRecentFileListWithOneFileOpened() throws RecentFileNullException{
		this.prog.openFile("TDD.txt");
		
		assertEquals("TDD.txt", this.prog.getRecentFileList());
	}
	
	@Test
	public void testReturnOfRecentFileListWithTwoFilesOpened() throws RecentFileNullException{
		this.prog.openFile("TDD.txt");
		this.prog.openFile("DAS.txt");
		
		assertEquals("TDD.txt DAS.txt", this.prog.getRecentFileList());
	}
}
