package jfx_lab;

import java.util.Arrays;
import java.util.stream.Collectors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
//import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Menus extends Application {
	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane border = new BorderPane();
		Scene scene = new Scene(border, 400, 400, Color.RED);

		MenuBar menuBar = new MenuBar();
		menuBar.prefWidthProperty().bind(stage.widthProperty());
		border.setTop(menuBar);

		Menu menu = new Menu("Menu");
		menu.setMnemonicParsing(true);
		MenuItem address = new MenuItem("Address");
		menu.getItems().add(address);
		// address.setOnAction(actionEvent->Lab_2.main(null));

		MenuItem utility = new MenuItem("Utility");
		menu.getItems().add(utility);

		MenuItem exitMenu = new MenuItem("Exit");
		menu.getItems().add(exitMenu);
		exitMenu.setOnAction(actionEvent -> Platform.exit());

		///////////////
		address.setOnAction(e->{
				// TODO Auto-generated method stub
				Stage secondStage = new Stage();
				secondStage.setTitle("Address Form");
				GridPane grid = new GridPane();
				grid.setAlignment(Pos.TOP_CENTER);
				grid.setHgap(5);
				grid.setVgap(5);

				grid.setPadding(new Insets(25, 25, 25, 25));

				Label lblName = new Label("Name: ");
				grid.add(lblName, 0, 1);

				Label lblStreet = new Label("Street: ");
				grid.add(lblStreet, 2, 1);

				Label lblCity = new Label("City: ");
				grid.add(lblCity, 4, 1);

				TextField txtName = new TextField();
				grid.add(txtName, 0, 2);

				TextField txtStreet = new TextField();
				grid.add(txtStreet, 2, 2);

				TextField txtCity = new TextField();
				grid.add(txtCity, 4, 2);

				Label lblState = new Label("State: ");
				grid.add(lblState, 1, 3);

				Label lblZip = new Label("Zip: ");
				grid.add(lblZip, 3, 3);

				TextField txtState = new TextField();
				grid.add(txtState, 1, 4);

				TextField txtZip = new TextField();
				grid.add(txtZip, 3, 4);

				Button btnSubmit = new Button("Submit");
				grid.add(btnSubmit, 2, 6);

				// btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
				btnSubmit.setOnAction(eventAddress -> {

					// @Override
					// public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					System.out.println(txtName.getText());
					System.out.println(txtStreet.getText());
					System.out.println(txtCity.getText() + " " + txtState.getText() + ", " + txtZip.getText());
					// }
				});

				Scene sceneAddress = new Scene(grid, 800, 200);
				secondStage.setScene(sceneAddress);
				secondStage.show();
		});

		utility.setOnAction(eventUtility-> {
			Stage stageUtility = new Stage();
			stageUtility.setTitle("String Utility");
			GridPane grid = new GridPane();
			Scene sceneUtility = new Scene(grid, 550, 250);
			stageUtility.setScene(sceneUtility);
			stageUtility.show();

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
			
		});
		////////////

		
		
		menuBar.getMenus().add(menu);
		stage.setScene(scene);
		stage.show();
	}

}
