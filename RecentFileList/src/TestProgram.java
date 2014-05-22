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
}
