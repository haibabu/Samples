package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			StackPane root = new StackPane();
			// root.getChildren().add(btn);
			Scene scene = new Scene(root, 400, 400);
			Button btn = new Button();
			btn.setText("Hello World");
			
			
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information Dialog");
			alert.setHeaderText("Look, an Information Dialog");
			alert.setContentText("I have a great message for you!");

			btn.setOnAction((e) -> alert.showAndWait());
			ObservableList<String> names = FXCollections.observableArrayList("Julia", "Ian", "Sue", "Matthew", "Hannah",
					"Stephan", "Denise");
			ListView<String> listView = new ListView<String>(names);
			root.getChildren().add(listView);
			
			ComboBox comboBox=new ComboBox<>();
			comboBox.setItems(names);
			root.getChildren().add(comboBox);
			root.getChildren().add(btn);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
