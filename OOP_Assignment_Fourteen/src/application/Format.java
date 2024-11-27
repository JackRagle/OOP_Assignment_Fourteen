package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class Format implements Initializable{

	@FXML private HBox results;
	@FXML private Label startnum;
	@FXML private Label startunit;
	@FXML private Label endnum;
	@FXML private Label endunit;
	@FXML private TextField numunits;
	double amount;
	
	
	
    public void handleMITOKMButtonAction(ActionEvent event) throws NumberFormatException {
        amount = Double.parseDouble(numunits.getText());
        amount = amount * 1.609344;
        startnum.setText(numunits.getText());
        startunit.setText("Miles");
        endnum.setText(Double.toString(amount));
        endunit.setText("Kilometers");
        results.setOpacity(100);
    }
    @FXML protected void handleKMTOMIButtonAction(ActionEvent event) throws NumberFormatException {
    	amount = Double.parseDouble(numunits.getText());
        amount = amount * 0.62137119;
        startnum.setText(numunits.getText());
        startunit.setText("Kilometers");
        endnum.setText(Double.toString(amount));
        endunit.setText("Miles");
        results.setOpacity(100);
    }
    @FXML protected void handleLBTOKGButtonAction(ActionEvent event) throws NumberFormatException {
    	amount = Double.parseDouble(numunits.getText());
        amount = amount * 0.45359237;
        startnum.setText(numunits.getText());
        startunit.setText("Pounds");
        endnum.setText(Double.toString(amount));
        endunit.setText("Kilograms");
        results.setOpacity(100);
    }
    @FXML protected void handleKGTOLBButtonAction(ActionEvent event) throws NumberFormatException {
    	amount = Double.parseDouble(numunits.getText());
        amount = amount * 2.20462262;
        startnum.setText(numunits.getText());
        startunit.setText("Kilograms");
        endnum.setText(Double.toString(amount));
        endunit.setText("Pounds");
        results.setOpacity(100);
    }
	@FXML protected void handleINTOCMButtonAction(ActionEvent event) throws NumberFormatException {
		amount = Double.parseDouble(numunits.getText());
        amount = amount * 2.54;
        startnum.setText(numunits.getText());
        startunit.setText("Inches");
        endnum.setText(Double.toString(amount));
        endunit.setText("Centimeters");
        results.setOpacity(100);
	}
	@FXML protected void handleCMTOINButtonAction(ActionEvent event) throws NumberFormatException {
		amount = Double.parseDouble(numunits.getText());
        amount = amount * 0.39370079;
        startnum.setText(numunits.getText());
        startunit.setText("Centimeters");
        endnum.setText(Double.toString(amount));
        endunit.setText("Inches");
        results.setOpacity(100);
	}
	@FXML protected void handleOZTOMLButtonAction(ActionEvent event) throws NumberFormatException {
		amount = Double.parseDouble(numunits.getText());
        amount = amount * 29.5735296;
        startnum.setText(numunits.getText());
        startunit.setText("Ounces");
        endnum.setText(Double.toString(amount));
        endunit.setText("Milliliters");
        results.setOpacity(100);
	}
	@FXML protected void handleMLTOOZButtonAction(ActionEvent event) throws NumberFormatException {
		amount = Double.parseDouble(numunits.getText());
        amount = amount * 0.03381402;
        startnum.setText(numunits.getText());
        startunit.setText("Milliliters");
        endnum.setText(Double.toString(amount));
        endunit.setText("Ounces");
        results.setOpacity(100);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		numunits.setText("");	
	}
}
