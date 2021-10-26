package com.company;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {
    public static void display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("title");
        window.setMinWidth(250);

        Label label2 = new Label();
        label2.setText(message);
        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(e -> window.close());

        VBox layout3 = new VBox(30);
        layout3.getChildren().addAll(label2, closeButton);
        layout3.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout3);
        window.setScene(scene);
        window.showAndWait();

    }

}
