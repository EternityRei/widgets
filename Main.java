package com.company;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.animation.Animation;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;


public class Main extends Application{
    Button button;
    Scene scene1,scene2;
    @Override
    public void start(Stage window) throws Exception {
        window.setTitle("Widgets"); //programme name

        Label label1 = new Label("Welcome to the widgets programme"); //text on the scene
        Button button1 = new Button("Go to the widgets");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - children and laid out in vertical column
        StackPane layout1 = new StackPane(); //distance from label1 to button2
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 300, 250);

        //button3
        Button button2 = new Button("Select");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout 2
        StackPane layout2 = new StackPane(); //just "background"
        layout2.getChildren().add(button2); //show objects on bg
        scene2 = new Scene(layout2, 300, 250);

        window.setScene(scene1); //choose the start scene

        Button button4 = new Button("Choose");
        button4.setOnAction((e -> AlertBox.display("Widgets to show", "Choose your widget")));

        window.show();
    }

    public static void main(String[] args) {
	Application.launch(args);
    }
}
