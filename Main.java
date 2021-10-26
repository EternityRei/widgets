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

        Label welcoming_label = new Label("Welcome to the widgets programme"); //text on the scene
        Button button_start = new Button("Start");
        button_start.setOnAction(e -> window.setScene(scene_widgets));

        //Layout 1 - children and laid out in the center
        VBox layout1st = new VBox(20);
        layout1st.getChildren().addAll(welcoming_label, button_start);
        layout1st.setAlignment(Pos.CENTER);
        scene_begin = new Scene(layout1st, 800, 500);

        //button_widgets
        Button button_widgets = new Button("Select");
        button_widgets.setOnAction(e -> window.setScene(scene_begin));

        //Layout 2
        StackPane layout2nd = new StackPane(); //just "background"
        layout2nd.getChildren().add(button_widgets); //show objects on bg
        layout2nd.setAlignment(Pos.BOTTOM_CENTER);
        scene_widgets = new Scene(layout2nd, 800, 500);
	    
        window.show();
    }

    public static void main(String[] args) {
	Application.launch(args);
    }
}
