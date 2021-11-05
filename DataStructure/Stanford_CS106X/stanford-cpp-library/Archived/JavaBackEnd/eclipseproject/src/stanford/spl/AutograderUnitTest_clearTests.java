package stanford.spl;

import acm.util.TokenScanner;

public class AutograderUnitTest_clearTests extends JBESwingCommand {

	public void execute(TokenScanner paramTokenScanner, JavaBackEnd paramJavaBackEnd) {
		paramTokenScanner.verifyToken("(");
		boolean isStyleCheck = nextBoolean(paramTokenScanner);
		paramTokenScanner.verifyToken(")");
		
		AutograderUnitTestGUI gui = AutograderUnitTestGUI.getInstance(paramJavaBackEnd, isStyleCheck);
		gui.clearTests();
	}
}
