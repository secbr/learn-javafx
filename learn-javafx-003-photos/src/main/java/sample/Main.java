package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	String[] imagesUrls = {
			"01.png", "02.jpg"
	};
	Image[] images = new Image[2];
	ImageView imageView = new ImageView();
	/**
	 * 当前显示的图片
	 */
	int currentIndex = 0;

	@Override
	public void start(Stage primaryStage) {

		BorderPane root = new BorderPane();
		// 初始化第一个图片
		imageView.setImage(new Image(imagesUrls[0]));

		Button button = new Button("下一张");
		button.setOnAction(event -> {
			showNext();
		});

		// 初始化images内容
		for (int i = 0; i < images.length; i++) {
			images[i] = new Image(imagesUrls[i]);
		}

		imageView.setPreserveRatio(true);
		imageView.setFitWidth(400);
		imageView.setFitHeight(400);

		root.setTop(button);
		root.setCenter(imageView);

		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().getResource("sample.fxml").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void showNext() {
		currentIndex++;
		if (currentIndex >= 2) {
			currentIndex = 0;
		}
		imageView.setImage(images[currentIndex]);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
