/*
 * @author Marty Stepp
 * @version 2016/11/26
 * - initial version
 */

package stanford.spl;

import acm.graphics.GObject;
import acm.util.JTFTools;
import acm.util.TokenScanner;
import java.awt.Font;

public class GTable_setRowFont extends JBESwingCommand {
	public void execute(TokenScanner scanner, JavaBackEnd jbe) {
		scanner.verifyToken("(");
		String interactorID = nextString(scanner);
		scanner.verifyToken(",");
		int row = nextInt(scanner);
		scanner.verifyToken(",");
		String fontStr = nextString(scanner);
		scanner.verifyToken(")");
		
		GObject gobj = jbe.getGObject(interactorID);
		if (gobj != null && gobj instanceof GTable) {
			GTable table = (GTable) gobj;
			Font font = JTFTools.decodeFont(fontStr);
			table.setRowFont(row, font);
		}
	}
}
