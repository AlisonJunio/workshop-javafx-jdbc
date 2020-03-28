package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable {

	@FXML
	private TableView<Department> tableViewDepartment;
	
	@FXML
	private TableColumn<Department, Integer> TableColumnId;
	
	@FXML
	private TableColumn<Department, String> TableColumnName;
	
	@FXML
	private Button btNew;
	
	@FXML
	public void onBtNewAction() {
		System.out.println("OnBtNewAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
		}
	// Inicia o comportamento das colunas
	private void initializeNodes() {
		TableColumnId.setCellValueFactory(new PropertyValueFactory<>("id")); // id  - variavel da classe department
		TableColumnName.setCellValueFactory(new PropertyValueFactory<>("name")); // name - variavel da classe department
		
		Stage stage =  (Stage) Main.getMainScene().getWindow();
		tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
		
	}
	

}
