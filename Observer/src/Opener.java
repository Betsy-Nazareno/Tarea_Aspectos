import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Opener {
	
	public static void enlace(String enlaceAAceder) {
	    Desktop enlace = Desktop.getDesktop();
	    try {
	        enlace.browse(new URI(enlaceAAceder));
	    } catch (IOException | URISyntaxException e) {
	        System.out.println("Error");
	    }
	}
}
