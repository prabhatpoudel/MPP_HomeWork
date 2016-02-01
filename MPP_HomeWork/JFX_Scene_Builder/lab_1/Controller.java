package lab_1;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements EventHandler<ActionEvent> {
	@FXML
	private TextField txtUserName;
	public TextField txtStreet;
	public TextField txtCity;
	public TextField txtState;
	public TextField txtZip;
	public Button btnSubmit;

	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		btnSubmit.setOnAction(e -> {
			System.out.println(txtUserName.getText());
			System.out.println(txtStreet.getText());
			System.out.println(txtCity.getText() + " " + txtState.getText() + ", " + txtZip.getText());
		});

	}

}
