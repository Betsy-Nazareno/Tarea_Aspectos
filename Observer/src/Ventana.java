import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
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
	private Label l;
	private HBox titb;
	private VBox vpanel;
	
	
	 public Ventana(Stage pstage){
	        root =new VBox();
	        l = new Label("REDES SOCIALES");
	        btnfb = new Button("Facebook");
	        btnfb.setTextFill(Color.web("#0000ff"));
	        btnytb = new Button("Youtube");
	        btnytb.setTextFill(Color.web("#ff0000"));
	        btntwt = new Button("Twitter");
	        btntwt.setTextFill(Color.web("#0076a3"));
	        btnig = new Button("Instagram");
	        btnig.setTextFill(Color.web("#990099"));
	        hpanel = new HBox();
	        vpanel = new VBox();
	        titb = new HBox();
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
	
	private void organizarTitulo() {
		
		l.setStyle(" -fx-font: 100px Tahoma;" +
                "    -fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 70%);" +
                "    -fx-stroke: black;" +
                "    -fx-stroke-width: 1;");
        titb.getChildren().add(l);
	}
	
	public void organizarElementos() {
		organizarTitulo();
		VBox recfb = new VBox(); 
		VBox recyt = new VBox(); 
		VBox rectw = new VBox(); 
		VBox recig = new VBox(); 
		recfb.getChildren().addAll(imgfb, btnfb);
		recyt.getChildren().addAll(imgytb, btnytb);
		rectw.getChildren().addAll(imgtwt, btntwt);
		recig.getChildren().addAll(imgig, btnig);
		
		recfb.setAlignment(Pos.CENTER);
		rectw.setAlignment(Pos.CENTER);
		recyt.setAlignment(Pos.CENTER);
		recig.setAlignment(Pos.CENTER);
		
		
		
		hpanel.getChildren().addAll(recfb, recyt, rectw, recig );
		hpanel.setSpacing(40);
		
		vpanel.getChildren().add(hpanel);
			hpanel.setAlignment(Pos.CENTER);
		
		root.getChildren().addAll(titb, vpanel);
	       titb.setAlignment(Pos.CENTER);
	       vpanel.setAlignment(Pos.CENTER);
		
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
