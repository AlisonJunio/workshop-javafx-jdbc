package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	//Itens de Menu
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	// tratamento de ações dos itens
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("OnMenuItemSellerAction");
	}
	
	@FXML
	public void onMenuItemDepartmentAction() {
		System.out.println("OnMenuItemDepartmentAction");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("OnMenuItemAboutAction");
	}
	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

}
