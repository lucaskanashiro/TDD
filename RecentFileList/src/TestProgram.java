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
	
	@Test
	public void testReturnOfRecentFileListWithSameFilesOpened() throws RecentFileNullException{
		this.prog.openFile("TDD.txt");
		this.prog.openFile("DAS.txt");
		this.prog.openFile("DAS.txt");
		
		assertEquals("DAS.txt TDD.txt", this.prog.getRecentFileList());
	}
	
	@Test
	public void testReturnOfRecentFileListWithMaximumFilesOpenend() throws RecentFileNullException{
		this.open15Files();
		
		String shouldReturn = "TDD.txt DAS.txt A.txt B.txt C.txt D.txt E.txt F.txt " +
				"G.txt H.txt I.txt J.txt K.txt L.txt M.txt";
		
		assertEquals(shouldReturn, this.prog.getRecentFileList());
	}
	
	@Test
	public void testReturnOfRecentFileListWithMoreThanMaximumFilesOpenend() throws RecentFileNullException{
		this.open15Files();
		this.prog.openFile("last.txt");
		
		String shouldReturn = "DAS.txt A.txt B.txt C.txt D.txt E.txt F.txt " +
				"G.txt H.txt I.txt J.txt K.txt L.txt M.txt last.txt";
		
		assertEquals(shouldReturn, this.prog.getRecentFileList());
	}
	
	@Test
	public void testReturnOfRecentFileListWithMoreThanMaximumAndSameFilesOpenend() throws RecentFileNullException{
		this.open15Files();
		this.prog.openFile("M.txt");
		
		String shouldReturn = "M.txt TDD.txt DAS.txt A.txt B.txt C.txt D.txt E.txt F.txt " +
				"G.txt H.txt I.txt J.txt K.txt L.txt";
		
		assertEquals(shouldReturn, this.prog.getRecentFileList());
	}
	
	private void open15Files(){
		this.prog.openFile("TDD.txt");
		this.prog.openFile("DAS.txt");
		this.prog.openFile("A.txt");
		this.prog.openFile("B.txt");
		this.prog.openFile("C.txt");
		this.prog.openFile("D.txt");
		this.prog.openFile("E.txt");
		this.prog.openFile("F.txt");
		this.prog.openFile("G.txt");
		this.prog.openFile("H.txt");
		this.prog.openFile("I.txt");
		this.prog.openFile("J.txt");
		this.prog.openFile("K.txt");
		this.prog.openFile("L.txt");
		this.prog.openFile("M.txt");
	}
}
