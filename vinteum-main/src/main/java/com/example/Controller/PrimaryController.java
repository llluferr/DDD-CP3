package com.example.Controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.example.App;
import com.example.Carta.Carta;
import com.example.Jogo.Jogo;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class PrimaryController {

    @FXML private HBox mesaDoJogador;
    @FXML private HBox mesaDoComputador;
    @FXML private ImageView monte;

    @FXML private Label pontosMesa;
    @FXML private Label pontosJogador;
    @FXML private Label resultado;

    private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    private static final String USER = "RM93205";
    private static final String PASSWORD ="120804";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);

    }

    /*public void inserir() throws SQLException{
        Connection con = getConnection();
        var stm = con.prepareStatement("INSERT INTO DDD_CALCULADORA_TB_LOG VALUES (?)");
        stm.setInt(1, getPontos());
        
        stm.execute();
        stm.close();
    }*/

    Jogo jogo = new Jogo();

    public void turno(){

    }

    public void atualizar(){
        
    }

    public void novoJogo(){

    }

    public void pedirCarta(){

    }

    public void parar(){

    }
    

     private ImageView imagemCarta(Carta carta) {
       return new ImageView(App.class.getResource(carta.imagePath()).toString());
    }

}
