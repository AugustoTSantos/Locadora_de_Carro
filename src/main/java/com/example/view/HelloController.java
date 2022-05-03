package com.example.view;

import DTO.Carros;
import DTO.Clientes;
import DTO.Funcionarios;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class HelloController {

    @FXML
    private TextField CaixaTextoCambioAutomaticoCarros;

    @FXML
    private TextField CaixaTextoComCarroAtualmenteClientes;

    @FXML
    private TextField CaixaTextoMarcaCarros;

    @FXML
    private TextField CaixaTextoNomeClientes;

    @FXML
    private TextField CaixaTextoNomeFuncionarios;

    @FXML
    private TextField CaixaTextoNumeroFuncionarios;

    @FXML
    private TextField CaixaTextoNumeroNegociacoesClientes;

    @FXML
    private TextField CaixaTextoPlacaCarros;

    @FXML
    private TextField CaixaTextoSalarioFuncionarios;

    @FXML
    private TextField CaixaTextoValorAluguelCarros;

    @FXML
    void BotaoConfirmarCarros(ActionEvent event) {
    	String Placa = this.CaixaTextoPlacaCarros.getText();
    	String Marca = this.CaixaTextoMarcaCarros.getText();
    	String ValorAluguel = this.CaixaTextoValorAluguelCarros.getText();
    	String CambioAutomatico = this.CaixaTextoCambioAutomaticoCarros.getText();
    	
    	Carros objetoCarros = new Carros(Placa, Marca, ValorAluguel, CambioAutomatico);
    	objetoCarros.setPlaca(Placa);
    	objetoCarros.setMarca(Marca);
    	objetoCarros.setValorAluguel(ValorAluguel);
    	objetoCarros.setCambioAutomatico(CambioAutomatico);
    	
    	System.out.format("A placa é: %s\nA marca é: %s\nO valor do aluguel é: %s\nTem cambio automatico?: %s",
    			Placa, Marca, ValorAluguel, CambioAutomatico);
    		   
    	ArrayList<String> Carros = new ArrayList<String>();
    	Carros.add(objetoCarros.getPlaca());
    	Carros.add(objetoCarros.getMarca());
    	Carros.add(objetoCarros.getValorAluguel());
    	Carros.add(objetoCarros.getCambioAutomatico());
    	
    	JOptionPane.showMessageDialog(null, Carros);
    }

    @FXML
    void BotaoConfirmarClientes(ActionEvent event) {
    	String NomeCLiente = this.CaixaTextoNomeClientes.getText();
    	String NumeroNegociacoes = this.CaixaTextoNumeroNegociacoesClientes.getText();
    	String ComCarroAtualmente = this.CaixaTextoComCarroAtualmenteClientes.getText();
    	
    	Clientes objetoClientes = new Clientes(NomeCLiente, NumeroNegociacoes, ComCarroAtualmente);
    	objetoClientes.setNomeCliente(NomeCLiente);
    	objetoClientes.setNumeroNegociacoes(NumeroNegociacoes);
    	objetoClientes.setComCarroAtualmente(ComCarroAtualmente);
    	
    	System.out.format("O nome do cliente é: %s\nO número de negociações é: %s\nEle(a) está com um carro atualmente?: %s",
    	NomeCLiente, NumeroNegociacoes, ComCarroAtualmente);

    	ArrayList<String> Clientes = new ArrayList<String>();
    	Clientes.add(objetoClientes.getNomeCliente());
    	Clientes.add(objetoClientes.getNumeroNegociacoes());
    	Clientes.add(objetoClientes.getComCarroAtualmente());
    	
    	JOptionPane.showMessageDialog(null, Clientes);
    }

    @FXML
    void BotaoConfirmarFuncionarios(ActionEvent event) {
    	String NomeFuncionario = this.CaixaTextoNomeFuncionarios.getText();
    	String Salario = this.CaixaTextoSalarioFuncionarios.getText();
    	String Numero = this.CaixaTextoNumeroFuncionarios.getText();
    	
    	Funcionarios objetoFuncionarios = new Funcionarios(NomeFuncionario, Salario, Numero);
    	objetoFuncionarios.setNomeFuncionario(NomeFuncionario);
    	objetoFuncionarios.setSalario(Salario);
    	objetoFuncionarios.setNumero(Numero);
    	
    	System.out.format("O nome do funcionario é: %s\nO salario é: %s\nO número é: %s",
    	NomeFuncionario, Salario, Numero);

    	ArrayList<String> Funcionarios = new ArrayList<String>();
    	Funcionarios.add(objetoFuncionarios.getNomeFuncionario());
    	Funcionarios.add(objetoFuncionarios.getSalario());
    	Funcionarios.add(objetoFuncionarios.getNumero());
    	
    	JOptionPane.showMessageDialog(null, Funcionarios);
    }
}
