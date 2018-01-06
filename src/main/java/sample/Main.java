package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.ignite.Ignite;
import org.apache.ignite.binary.BinaryObject;

import java.util.*;

import static Utl.IgniteUtl.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args)
    {
	    Map<String, String> attrs = Collections.singletonMap("AGENT", "2");
		// launch(args);
	    Ignite sendig = startIgnite_send(attrs);
	    Collection<UUID> c_uids = new ArrayList<> ();
	    send_message (sendig,"Luodian","AGENT","2");
    }
}
