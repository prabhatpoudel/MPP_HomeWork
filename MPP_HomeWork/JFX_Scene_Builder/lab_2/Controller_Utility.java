package lab_2;

import java.util.Arrays;
import java.util.stream.Collectors;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller_Utility implements EventHandler<ActionEvent>{
	public Button btnCount;
	public Button btnReverse;
	public Button btnDuplicate;
	public TextField txtInput;
	public TextField txtOutput;

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void duplicate(ActionEvent event)
	{
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
		
	}
	
	public void reverse(ActionEvent event)
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
	}
	
	public void count(ActionEvent event)
	{
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

}
