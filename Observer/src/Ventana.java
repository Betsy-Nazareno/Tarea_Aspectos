import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ventana {
	private VBox root;
	private Button btnfb;
	private Button btnytb;
	private Button btntwt;
	private Button btnig;
	private HBox hpanel;
	private ImageView imgfb;
	private ImageView imgtwt;
	private ImageView imgytb;
	private ImageView imgig;
	
	
	
	 public Ventana(Stage pstage){
	        root =new VBox();
	        btnfb = new Button("Facebook");
	        btnytb = new Button("Youtube");
	        btntwt = new Button("Twitter");
	        btnig = new Button("Instagram");
	        hpanel = new HBox();
	        imgfb = new ImageView(new Image("/recursos/facebook.png"));
	        imgtwt = new ImageView(new Image("/recursos/twitter.png"));
	        imgytb = new ImageView(new Image("/recursos/youtube.png"));
	        imgig = new ImageView(new Image("/recursos/instagram.png"));
	        setActions();
	        organizarElementos();
	        
	    }


	public void setActions() {
		btnfb.setOnAction(e-> {
			cambiarColorVentana(btnfb.getText());
		    enlace("www.facebook.com");
		
		});
		btnytb.setOnAction(e->{ 
			cambiarColorVentana(btnytb.getText());
			enlace("www.youtube.com");
			});
		btntwt.setOnAction(e-> { 
			cambiarColorVentana(btntwt.getText());
			enlace("www.twitter.com");
			});
		btnig.setOnAction(e->{ 
			cambiarColorVentana(btnig.getText());
			enlace("www.instagram.com");
			});
		
		
	}
	
	public void organizarElementos() {
		VBox recfb = new VBox(); 
		VBox recyt = new VBox(); 
		VBox rectw = new VBox(); 
		VBox recig = new VBox(); 
		recfb.getChildren().addAll(imgfb, btnfb);
		recyt.getChildren().addAll(imgytb, btnytb);
		rectw.getChildren().addAll(imgtwt, btntwt);
		recig.getChildren().addAll(imgig, btnig);

		
		hpanel.getChildren().addAll(recfb, recyt, rectw, recig );
		hpanel.setSpacing(40);
		root.getChildren().addAll(hpanel);
		
		formatearTamanio(imgfb);
		formatearTamanio(imgtwt);
		formatearTamanio(imgig);
		formatearTamanio(imgytb);
	}
	
	public void formatearTamanio(ImageView img) {
		img.setFitHeight(40);
		img.setFitWidth(40);
	}
	
	public void cambiarColorVentana( String redsocial) {
		if (redsocial.equals("Facebook")) 
			root.setBackground(new Background(new BackgroundFill(Color.ROYALBLUE, null, null)));
		else if (redsocial.equals("Youtube"))
			root.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
		else if (redsocial.equals("Instagram"))
			root.setBackground(new Background(new BackgroundFill(Color.MEDIUMPURPLE, null, null)));
		else if (redsocial.equals("Twitter"))
			root.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, null, null)));
		
	}
	public void enlace(String enlaceAAceder) {
	    Desktop enlace = Desktop.getDesktop();
	    try {
	        enlace.browse(new URI(enlaceAAceder));
	    } catch (IOException | URISyntaxException e) {
	        System.out.println("Error");
	    }
	}
	public Scene getSceneInicio(){
	        Scene escenaInicio=new Scene(getRoot(),900, 500);
	        return escenaInicio;
	}
	    
	
	public VBox getRoot() {
		return root;
	}


	public void setRoot(VBox root) {
		this.root = root;
	}


	public HBox getHpanel() {
		return hpanel;
	}


	public void setHpanel(HBox hpanel) {
		this.hpanel = hpanel;
	}
}
