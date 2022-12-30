package PharmacyManagementSystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class FXMLDocumentController {

    @FXML
    private Button login;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private Button close;
    public String user;
    public String pass;
    public void close(){
        System.exit(0);
    }

    public void readFile() throws FileNotFoundException {

        File file = new File("D:\\Pharmacy_Admin_inf.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            user = scan.nextLine();
            pass = scan.nextLine();
        }

    }

    public void loginAdmin() {
        username.setText(username.getText());
        password.setText(password.getText());
        if (username.getText().isEmpty() || password.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blank Fields");
            alert.showAndWait();
        } else if ((username.getText()).equals(user) && (password.getText()).equals(pass)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Successfully login");
            alert.showAndWait();


            login.getScene().getWindow().hide();

            /*Parent root= FXMLLoader.load((getClass().getResource("/dashboard.fxml"));
            Stage stage=new Stage();
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.show();*/
        } else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Wrong password/username");
            alert.showAndWait();

        }

    /*public void initialize(URL url,ResourceBundle rb){

    }*/
    }
}



