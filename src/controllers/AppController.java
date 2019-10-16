package controllers;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import views.TripOverviewView;
import views.View;

/**
 * @author Oussama Fahchouch
 */
public class AppController {
	private static AppController appController = null;
	private static Stage primaryStage;
	
	/**
	 * @author Oussama Fahchouch
	 */
	public AppController(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	/**
	 * @author Oussama Fahchouch
	 * @return AppController
	 */
	public static AppController getInstance() {
        return appController; 
	}
	
	/**
	 * @author Oussama Fahchouch
	 * @param view
	 */
	public static void loadView(View view){
		primaryStage.setScene(view.getScene());
		primaryStage.show();
	}
	
	/**
	 * @author Oussama Fahchouch
	 * @return
	 */
	public static Stage getPrimaryStage() {
		return primaryStage;
	}

	/**
	 * @author Oussama Fahchouch
	 * @param primaryStage
	 */
	public static void setPrimaryStage(Stage primaryStage) {
		primaryStage = primaryStage;
	};
}
