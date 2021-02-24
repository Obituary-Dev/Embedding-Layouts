package embedding.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Obituary
 */
public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("the new boston");
        
        // not used: find libraries for the file edit view content on top of the window
        HBox topmenu = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topmenu.getChildren().addAll(buttonA, buttonB, buttonC);

        VBox leftmenu = new VBox();
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");
        leftmenu.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topmenu);
        borderPane.setLeft(leftmenu);
        
        // StackPane layout = new StackPane();
        Scene scene = new Scene(borderPane, 300, 250); // layout 
        window.setScene(scene);
        window.show();
    }

}
