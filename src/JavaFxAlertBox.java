import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import javax.swing.*;
import java.util.Optional;


public class JavaFxAlertBox extends Application {
    @Override
    public void start(Stage primaryStage)throws Exception{
        JOptionPane pane = new JOptionPane("Enter your height");
        pane.setWantsInput(true);
        JDialog dialog=pane.createDialog("Enter your height");
        dialog.setLocation(0,275);
        dialog.setVisible(true);
        String strHeightCm=(String)pane.getInputValue();


        TextInputDialog textInputDialog=new TextInputDialog("100.5");
        textInputDialog.setTitle("Matrices Converter");
        textInputDialog.setHeaderText("Centimeter to Feet and Inches Converter");
        textInputDialog.setContentText("Enter your height in centimeter");
        textInputDialog.setX(450);
        textInputDialog.setY(20);
        Optional<String>result=textInputDialog.showAndWait();

        double dblHeightCm;
        dblHeightCm=Double.parseDouble(strHeightCm);
        double dblHeightIn= dblHeightCm*0.39;
        int HeightFt=(int)(dblHeightIn/12);
        int RemainderInches=(int)(dblHeightIn%12);

        JOptionPane pane2=new JOptionPane("Your height in feet and inches");
        dialog=pane2.createDialog("Your height in feet and inches");
        dialog.setLocation(1000,350);
        pane2.setMessage("Your height in centimeter is"+dblHeightCm+
                "\n"+"Your height in feet and inches is "+HeightFt+"feet \n and "+RemainderInches+"inches.");
        dialog.setVisible(true);

        String strHeightInCm="";
        double dblHeightInCm;
        dblHeightInCm=Double.parseDouble(result.get());

        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Height Converter");
        double dblHeightInches= dblHeightInCm * 0.39;
        int HeightInFt = (int)( dblHeightInches/12);
        int RemainderIn=(int)(dblHeightInches%12);
        alert.setHeaderText("Your height in ft and inches is");
        alert.setContentText(HeightInFt+"feet and "+RemainderIn+"inches.");
        alert.setX(450);
        alert.setY(500);

        alert.showAndWait();








    }
}
