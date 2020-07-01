import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Visor extends Application {
	
	
	
	public static void main(String[] args) {
        launch(args);
        System.out.println("Hola");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setOnCloseRequest( e ->  Platform.exit());
		Ventana it = new Ventana(primaryStage);
		primaryStage.setScene(it.getSceneInicio());
        primaryStage.show();
		
	}
	
	
}
