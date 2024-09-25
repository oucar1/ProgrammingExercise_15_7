package com.example.programmingexercise_15_7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * 15.7 (CHANGE COLOR USING A MOUSE)
 * Write a program that displays the color of a circle as black
 * when the mouse button is pressed, and as white when the mouse button is released.
 */

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Window size
        double width = 400;
        double height = 400;

        // Create a circle at the center with a white fill and black border
        Circle circle = new Circle(width / 2, height / 2, Math.min(width, height) / 10, Color.WHITE);
        circle.setStroke(Color.BLACK); // Set the stroke color of the circle

        // Create a layout pane and add the circle
        StackPane pane = new StackPane(circle);

        // Handle mouse press and release events
        pane.setOnMousePressed(e -> circle.setFill(Color.BLACK));  // Change color to black on press
        pane.setOnMouseReleased(e -> circle.setFill(Color.WHITE)); // Change color to white on release

        // Set up the scene and stage
        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Click the Circle");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
