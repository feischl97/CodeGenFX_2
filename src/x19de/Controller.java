package x19de;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


public class Controller {
	
	@FXML
	private BorderPane ctrls;
	
	@FXML
	private ComboBox<barcodeInterface> barcodeTypes;
	
	@FXML
	private Pane barcodeSettings;
	
	@FXML
	private HBox generalCtrl;
	
	@FXML
	private Button exit;
	
	@FXML
	private Button export;
	
	@FXML
	private Button generate;
	
	@FXML
	private ImageView previewBox;
}
