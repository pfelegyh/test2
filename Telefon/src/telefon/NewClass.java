/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefon;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Peter
 */
public class NewClass extends Application {

  private Group root = new Group();
  private Scene scene = new Scene(root,600,600);
  
  @Override
  public void start(Stage stage) throws Exception {
    stage.setScene(scene);
    stage.show();
  }
  
  public static void main(String[] args) {
    launch();
  }
}
