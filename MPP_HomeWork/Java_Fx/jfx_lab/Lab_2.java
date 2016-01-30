package jfx_lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.*;
//import javafx.scene.text.*;
import javafx.scene.control.*;
//import javafx.event.*;
import javafx.scene.control.Alert.AlertType;

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
		Scene scene = new Scene(grid, 550, 250);
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

		btnCountLetter.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub

				if (txtInput.getText().length() != 0) {
					txtOutput.setText(Integer.toString(txtInput.getText().length()));
				} else {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Information Dialog");
					alert.setHeaderText("Alert");
					alert.setContentText("Input is Empty!");
					alert.showAndWait();
				}
			}
		});
		
		btnRevLtr.setOnAction(e->
		{
			if (txtInput.getText().length() != 0) {
				String output ="";
				for(int i =txtInput.getText().length()-1; i>=0; i--)
				{
					output+=txtInput.getText().charAt(i);
				}
				txtOutput.setText(output);
			} else {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Information Dialog");
				alert.setHeaderText("Alert");
				alert.setContentText("Input is Empty!");
				alert.showAndWait();
			}
		});
		
		btnRmvDups.setOnAction(e-> {
				if (txtInput.getText().length() != 0) {
					String output ="";
					
					String [] array = txtInput.getText().split("");
					output = Arrays.asList(array).stream().distinct()
							.collect(Collectors.joining());
					txtOutput.setText(output);
				} else {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Information Dialog");
					alert.setHeaderText("Alert");
					alert.setContentText("Input is Empty!");
					alert.showAndWait();
				}
	
		});

	}
	
	

}
