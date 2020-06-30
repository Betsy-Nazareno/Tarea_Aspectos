import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Interfaz {
	private BorderPane root;
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private HBox hpanel;
	
	
	 public Interfaz(Stage pstage){
	        root =new BorderPane();
	        btn1 = new Button("Verde");
	        btn2 = new Button("Amarillo");
	        btn3 = new Button("Rojo");
	        hpanel = new HBox();
	        setActions();
	        organizarElementos();
	        
	    }


	public void setActions() {
		btn1.setOnAction(e-> cambiarColor(btn1.getText()));
		btn2.setOnAction(e-> cambiarColor(btn2.getText()));
		btn3.setOnAction(e-> cambiarColor(btn3.getText()));
		
		
	}
	
	public void organizarElementos() {
		hpanel.getChildren().addAll(btn1, btn2, btn3);
		hpanel.setSpacing(40);
		root.setCenter(hpanel);
	}
	
	public void cambiarColor(String color) {
		if (color.equals("Verde")) 
			root.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW, null, null)));
		else if (color.equals("Amarillo"))
			root.setBackground(new Background(new BackgroundFill(Color.YELLOW, null, null)));
		else if (color.equals("Rojo"))
			root.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
		
	}
	
	public Scene getSceneInicio(){
	        Scene escenaInicio=new Scene(getRoot(),900, 500);
	        return escenaInicio;
	}
	    
	
	public BorderPane getRoot() {
		return root;
	}


	public void setRoot(BorderPane root) {
		this.root = root;
	}


	public HBox getHpanel() {
		return hpanel;
	}


	public void setHpanel(HBox hpanel) {
		this.hpanel = hpanel;
	}
}
