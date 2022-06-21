package View;

import DAO.DaoAluguel;
import DAO.DaoCarro;
import DAO.DaoCliente;
import DAO.DaoFuncionario;
import DTO.Aluguel;
import DTO.Carro;
import DTO.Cliente;
import DTO.Funcionario;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class LocadoraController implements Initializable{
    
    @FXML
    private TextField textBoxAluguelCarro;

    @FXML
    private TextField textBoxDataAluguelAluguel;

    @FXML
    private TextField textBoxDataDevolucaoAluguel;

    @FXML
    private TextField textBoxDisponivelAtualmenteCarro;

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
    private TextField textFieldComCarroAtualmenteCliente;


    @FXML
    void confirmarAluguel(ActionEvent event) throws Exception {
        Aluguel data = new Aluguel();
        data.setDataEntrega(textBoxDataAluguelAluguel.getText());
        data.setDataNegociacao(textBoxDataDevolucaoAluguel.getText());
        try {
        	DaoAluguel daoAluguel = new DaoAluguel();
        	daoAluguel.cadastrar(data);
		} catch (Exception e) {
			exibiDialogoERRO("ERRO");
		}
    }
    
    @FXML
    void confirmarCarro(ActionEvent event) {
        Carro carro = new Carro();
        carro.setPlaca(textBoxPlacaCarro.getText());
        carro.setMarca(textBoxMarcaCarro.getText());
        carro.setValorAluguel(textBoxAluguelCarro.getText());
        carro.setDisponivelAtualmente(textBoxDisponivelAtualmenteCarro.getText());

        try {
            DaoCarro daoCarro = new DaoCarro();
            daoCarro.cadastrar(carro);
        } catch (Exception e) {
            exibiDialogoERRO("ERRO");
        }
    }

    @FXML
    void confirmarCliente(ActionEvent event) {
        Cliente cliente = new Cliente();
        cliente.setNomeCliente(textBoxNomeCliente.getText());
        cliente.setNumeroNegociacoes(textBoxNumeroNegociacoesCliente.getText());
        cliente.setComCarroAtualmente(textFieldComCarroAtualmenteCliente.getText());

        try {
            DaoCliente daoCliente = new DaoCliente();
            daoCliente.cadastrar(cliente);
        } catch (Exception e) {
            exibiDialogoERRO("ERRO");
        }
    }

    @FXML
    void confirmarFuncionario(ActionEvent event) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeFuncionario(textBoxNomeFuncionario.getText());
        funcionario.setSalario(textBoxSalarioFuncionario.getText());
        funcionario.setFuncao(textBoxFuncaoFuncionario.getText());

        try {
            DaoFuncionario daoFuncionario = new DaoFuncionario();
            daoFuncionario.cadastrar(funcionario);
        } catch (Exception e) {
            exibiDialogoERRO("ERRO");
        }
    }
    
    
    void exibiDialogoERRO(String erro) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Erro");
        alert.setHeaderText(null);
        alert.setContentText(erro);

        alert.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }
}
