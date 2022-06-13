package View;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class LocadoraController implements Initializable{

    private String[] opcoes = {"Sim", "Não"};

    
    @FXML
    private ComboBox<String> ComboBoxDisponivelAtualmenteCarro;

    @FXML
    private ComboBox<String> comboBoxComCarroAtualmenteCliente;


    @FXML
    private DatePicker datePickerDataAluguelNegociacao;

    @FXML
    private DatePicker datePickerDataEntregaNegociacao;


    @FXML
    private TextField textBoxAluguelCarro;

    @FXML
    private TextField textBoxFuncaoFuncionario;

    @FXML
    private TextField textBoxMarcaCarro;

    @FXML
    private TextField textBoxNomeCliente;

    @FXML
    private TextField textBoxNomeFuncionario;

    @FXML
    private TextField textBoxNumeroNegociacoesCliente;

    @FXML
    private TextField textBoxPlacaCarro;

    @FXML
    private TextField textBoxSalarioFuncionario;


    @FXML
    void confirmarCarro(ActionEvent event) {

    }

    @FXML
    void confirmarCliente(ActionEvent event) {

    }

    @FXML
    void confirmarFuncionario(ActionEvent event) {

    }

    @FXML
    void confirmarNegociacao(ActionEvent event) {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboBoxComCarroAtualmenteCliente.getItems().addAll(opcoes);
        ComboBoxDisponivelAtualmenteCarro.getItems().addAll(opcoes);
    }
}
