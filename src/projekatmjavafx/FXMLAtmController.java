/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekatmjavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Lely
 */
public class FXMLAtmController implements Initializable {

    String pin="";
    String PIN="1234";
    int kesempatan=3;
    int tmp;
    
    @FXML
    private PasswordField editPin;
    @FXML
    private Button satu;
    @FXML
    private Button dua;
    @FXML
    private Button tiga;
    @FXML
    private Button empat;
    @FXML
    private Button lima;
    @FXML
    private Button enam;
    @FXML
    private Button tujuh;
    @FXML
    private Button delapan;
    @FXML
    private Button sembilan;
    @FXML
    private Button C;
    @FXML
    private Button nol;
    @FXML
    private Button ok;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Tekan1(ActionEvent event) {
        pin+="1";
        editPin.setText(pin);
    }

    @FXML
    private void Tekan2(ActionEvent event) {
           pin+="2";
        editPin.setText(pin);
    }

    @FXML
    private void Tekan3(ActionEvent event) {
           pin+="3";
        editPin.setText(pin);
    }

    @FXML
    private void Tekan4(ActionEvent event) {
           pin+="4";
        editPin.setText(pin);
    }

    @FXML
    private void Tekan5(ActionEvent event) {
           pin+="5";
        editPin.setText(pin);
    }

    @FXML
    private void Tekan6(ActionEvent event) {
           pin+="6";
        editPin.setText(pin);
    }

    @FXML
    private void Tekan7(ActionEvent event) {
           pin+="7";
        editPin.setText(pin);
    }

    @FXML
    private void Tekan8(ActionEvent event) {
           pin+="8";
        editPin.setText(pin);
    }

    @FXML
    private void Tekan9(ActionEvent event) {
           pin+="9";
        editPin.setText(pin);
    }

    @FXML
    private void TekanC(ActionEvent event) {
           pin="";
        editPin.setText(pin);
    }

    @FXML
    private void Tekan0(ActionEvent event) {
           pin+="0";
        editPin.setText(pin);
    }

    @FXML
    private void TekanOK(ActionEvent event) {
        if(pin.equals(PIN)){
            try{
                ((Node) (event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLTransaksi.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 470, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            } catch (IOException e){
                System.out.println("Failed to create new Window." + e);
            }
        } else {
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa " + kesempatan
                    + " kesempatan lagi");
            editPin.setText("");
            pin = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }
    }
    
}
