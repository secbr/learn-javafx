package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		BorderPane root = new BorderPane();

		// 加载网络图片
//		Image image = new Image("https://www.choupangxia.com/wp-content/uploads/2019/07/weixin.jpg");
		// 加载本地图片
//		Image image = new Image("file:/Users/zzs/my/images/QQ20180302-0.png");
		// 加载classpath或资源文件文件
		Image image = new Image("QQ20180302-0.png");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		root.setCenter(imageView);

		double with = image.getWidth();
		double height = image.getHeight();

		Scene scene = new Scene(root, with, height);
		scene.getStylesheets().add(getClass().getResource("sample.fxml").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
