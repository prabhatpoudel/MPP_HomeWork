package jfx_lab;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.*;
//import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.event.*;
//import javafx.scene.paint.*;

public class Lab_1 extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
	    
		stage.setTitle("Address Form");
		GridPane grid= new GridPane();
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setHgap(5);
		grid.setVgap(5);
		
		grid.setPadding(new Insets(25,25,25,25));
		
		Label lblName = new Label("Name: ");
        grid.add(lblName, 0, 1);       
        
		Label lblStreet = new Label("Street: ");
        grid.add(lblStreet, 2, 1);
        
		Label lblCity = new Label("City: ");
        grid.add(lblCity, 4, 1);
        
        TextField txtName= new TextField();
        grid.add(txtName, 0, 2);
        
        TextField txtStreet= new TextField();
        grid.add(txtStreet, 2, 2);
        
        TextField txtCity= new TextField();
        grid.add(txtCity, 4, 2);
        
		Label lblState = new Label("State: ");
        grid.add(lblState, 1, 3);       
        
		Label lblZip = new Label("Zip: ");
        grid.add(lblZip, 3, 3);
        
        TextField txtState= new TextField();
        grid.add(txtState, 1, 4);
        
        TextField txtZip= new TextField();
        grid.add(txtZip, 3, 4);
        
        Button btnSubmit = new Button("Submit");
        grid.add(btnSubmit, 2, 6);
        
//        btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
        btnSubmit.setOnAction(e-> {
			
//			@Override
//			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println(txtName.getText());
				System.out.println(txtStreet.getText());
				System.out.println(txtCity.getText()+" "+txtState.getText()+", "+txtZip.getText());
//			}
		});
		
		Scene scene = new Scene(grid, 800, 200);
		stage.setScene(scene);
		stage.show();


		
	}

}
