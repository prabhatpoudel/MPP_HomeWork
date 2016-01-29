package jfx_lab;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.*;
//import javafx.scene.text.*;
import javafx.scene.control.*;
//import javafx.event.*;

public class Lab_2 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		stage.setTitle("String Utility");
		GridPane grid = new GridPane();
		Scene scene = new Scene(grid, 550, 200);
		stage.setScene(scene);
		stage.show();
		
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Button btnCountLetter = new Button("Count Letters");
		grid.add(btnCountLetter, 1, 1);
		
		Button btnRevLtr = new Button("Reverse Letters");
		grid.add(btnRevLtr, 1, 3);
		
		Button btnRmvDups = new Button("Remove Duplicates");
		grid.add(btnRmvDups, 1, 5);
		
		Label lblInput = new Label("Input");
		grid.add(lblInput, 2, 1);
		
		TextField txtInput = new TextField();
		grid.add(txtInput, 2, 2);
		
		Label lblOutput = new Label("Output");
		grid.add(lblOutput, 2, 3);
		
		TextField txtOutput = new TextField();
		grid.add(txtOutput, 2, 4);
		
		
		
		
	}

}
