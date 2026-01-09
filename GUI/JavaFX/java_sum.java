import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class java_sum extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l1 = new Label("First Number");
        Label l2 = new Label("Second Number");
        Label l3 = new Label("Result");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        t3.setEditable(false);
        Button bt1 = new Button("Sum");
        GridPane root = new GridPane();
        root.setPadding(new Insets(10));
        root.setVgap(10);
        root.setHgap(10);
        root.add(l1, 0, 0);
        root.add(t1, 1, 0);
        root.add(l2, 0, 1);
        root.add(t2, 1, 1);
        root.add(l3, 0, 2);
        root.add(t3, 1, 2);
        root.add(bt1, 0, 3);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        bt1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                int a, b, c;
                a = Integer.parseInt(t1.getText());
                b = Integer.parseInt(t2.getText());
                c = a + b;
                t3.setText(String.valueOf(c));
            }
        });
    }
}
