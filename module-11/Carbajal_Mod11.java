/*
 * Name: Natalia Carbajal
 * Date: 10/11/2026
 * Assignment: Module 11.2
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Carbajal_Mod11 extends Application {

    @Override
    public void start(Stage stage) {

        // Create the title
        Label title = new Label("JavaFX VBox and HBox");

        // Create the VBox
        Label vboxLabel = new Label("VBox Example");
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(15));
        vbox.getChildren().addAll(vboxLabel, button1, button2, button3);

        // Create the HBox
        Label hboxLabel = new Label("HBox Example");
        Button button4 = new Button("Button A");
        Button button5 = new Button("Button B");
        Button button6 = new Button("Button C");

        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(15));
        hbox.getChildren().addAll(hboxLabel, button4, button5, button6);

        // Put both layouts in one window
        VBox mainLayout = new VBox(20);
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.setPadding(new Insets(20));
        mainLayout.getChildren().addAll(title, vbox, hbox);

        // Display the window
        Scene scene = new Scene(mainLayout, 500, 350);
        stage.setTitle("VBox and HBox Examples");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
