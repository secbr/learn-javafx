package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		BorderPane root = new BorderPane();

		Button button = new Button("点我");
		root.setCenter(button);
		button.setOnAction(new MyEventHandler());

		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().getResource("sample.fxml").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private class MyEventHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			System.out.println("Hello world!");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
