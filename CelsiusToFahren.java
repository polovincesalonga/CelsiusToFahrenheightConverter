import javafx.application.*; 
import javafx.stage.*;
import javafx.scene.*; 
import javafx.scene.layout.*; 
import javafx.scene.control.*; 




public class CelsiusToFahren extends Application
{
    Button convert; 
    Label CelsiusLabel; 
    Label FahrenLabel; 
    Label resultLabel;

    TextField CelsiusField; 
    TextField FahrenField; 
    TextField resultField;


    @Override 
    public void start(Stage primaryStage) 
    {
        convert = new Button("Convert");

        convert.setOnAction(a -> convertCel()); 

        CelsiusLabel = new Label("Celsius"); 
        resultLabel = new Label("Fahrenheight"); 

        CelsiusField = new TextField(); 
        CelsiusField.setEditable(true); 

        
        resultField = new TextField(); 
        resultField.setEditable(false);

        GridPane pane = new GridPane(); 

        pane.add(CelsiusLabel,0,0); 
        pane.add(CelsiusField,1,0); 


        pane.add(resultLabel,0,3); 
        pane.add(resultField,1,3);

        pane.add(convert,0,6);

        Scene scene = new Scene(pane); 


        primaryStage.setScene(scene); 
        primaryStage.setTitle("Celsius to Fahrenheight Convert"); 
        primaryStage.show();

    }

    public void convertCel() 
    {
        double result;
        String cel; 
        double cels;
        
        cel = CelsiusField.getText();
        cels = Double.parseDouble(cel); 


        result = (cels * 9/5) + 32; 

        resultField.setText(Double.toString(result));
    }

    public static void main(String[] args)
    {
        launch(args);
    }

    
}