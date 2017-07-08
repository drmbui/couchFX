/**
 * Created by minhbui on 3/9/17.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class couchMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setTitle("JavaFX Welcome");
            GridPane grid = new GridPane();
            grid.setAlignment(Pos.CENTER);
            grid.setHgap(10);
            grid.setVgap(10);
            grid.setPadding(new Insets(25, 25, 25, 25));

            Text scenetitle = new Text("Welcome");
            scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
            grid.add(scenetitle, 0, 0, 2, 1);

            Label userName = new Label("User Name:");
            grid.add(userName, 0, 1);

            TextField userTextField = new TextField();
            grid.add(userTextField, 1, 1);

            Label pw = new Label("Password:");
            grid.add(pw, 0, 2);

            PasswordField pwBox = new PasswordField();
            grid.add(pwBox, 1, 2);

//            Button btnReadCouch = new Button("ReadCouch()");
//            HBox hbBtn = new HBox(10);
//            hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
//            hbBtn.getChildren().add(btnReadCouch);
//            grid.add(hbBtn, 1, 4);
//
//            final Text actiontargetReadCouch = new Text();
//            grid.add(actiontargetReadCouch, 1, 6);
//
//            btnReadCouch.setOnAction(new EventHandler<ActionEvent>() {
//                @Override public void handle(ActionEvent event) {
//                    actiontargetReadCouch.setFill(Color.FIREBRICK);
//                    actiontargetReadCouch.setText("ReadCouch() button pressed");
//                    ReadCouch bucket = new ReadCouch();
//                    bucket.Read();
//                }
//            });

            Button btnReadCouchN1QL = new Button("ReadCouchN1QL()");
            HBox hbBtn1 = new HBox(10);
            hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtn1.getChildren().add(btnReadCouchN1QL);
            grid.add(hbBtn1, 1, 4);

            final Text actiontarget = new Text();
            grid.add(actiontarget, 1, 6);

            btnReadCouchN1QL.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent event) {
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("ReadCouchN1QL() button pressed");
                    ReadCouchN1QL bucket1 = new ReadCouchN1QL();
                    bucket1.execute();
                }
            });

            Scene scene = new Scene(grid, 300, 275);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
