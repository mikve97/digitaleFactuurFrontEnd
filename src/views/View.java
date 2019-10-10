package views;

import javafx.scene.Scene;

/**
 * @author Oussama Fahchouch
 */
public interface View {	
	/**
	 * @author Oussama Fahchouch
	 */
	Scene createView();
	
	/**
	 * @author Oussama Fahchouch
	 */
	public void updateView();

	/**
	 * @author Oussama Fahchouch
	 * @return Scene 
	 */
	Scene getScene();
	
	/**
	 * @author Oussama Fahchouch
	 */
	void setScene(Scene sceneToSet);
}
