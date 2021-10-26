package com.company;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label_message = new Label();
        label_message.setText(message);

        //Creating two buttons
        Button applyButton = new Button("Apply");
        Button cancelButton = new Button("Cancel");

        applyButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        cancelButton.setOnAction(e -> {
            answer = false;
            window.close();
        });


        VBox layout3 = new VBox(30);
        layout3.getChildren().addAll(label_message, applyButton, cancelButton);
        layout3.setAlignment(Pos.CENTER);

        Scene scene_ConBox = new Scene(layout3);
        window.setScene(scene_ConBox );
        window.showAndWait();

        return answer;

    }

}
