import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Login_Form extends Application {
        public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage)throws Exception
    {
        Label l1=new Label("Welcome");
        l1.setFont(new Font(30));
        Label l2=new Label("User Name:");
        l2.setFont(new Font(15));
        Label l3=new Label("Password:");
        l3.setFont(new Font(15));
        Label l4=new Label();
        TextField t1=new TextField();
        TextField t2=new TextField();
        Button bt1=new Button("Sign in"); 
        GridPane root=new GridPane();
        root.setPadding(new Insets(10));
        root.setVgap(10);
        root.setHgap(10);
        root.add(l1,0,0);
        root.add(l2, 0, 1);
        root.add(l3, 0, 2);
        root.add(t1,1,1);
        root.add(t2,1,2);
        root.add(l4, 1, 4);
        HBox b1=new HBox(bt1);
        b1.setAlignment(Pos.CENTER_RIGHT);
        root.add(b1,1,3);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.setScene(scene);
        primaryStage.show();
         bt1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
               String name=t1.getText();
               String Password=t2.getText();
               if(name.equals("NCIT")&&Password.equals("NCIT@2024Spring"))
               {
                   l4.setText("Login Successfully");
               }
               else
               {
                l4.setText("Invalid User Name or Password");
               }
               }
        });
        
    }

    
}
