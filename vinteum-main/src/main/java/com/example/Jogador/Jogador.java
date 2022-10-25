package com.example.Jogador;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    
    private int pontos;
    List<String> cartas = new ArrayList<String>();
    private boolean parou = false;

    public void receberCarta(){

    }

    public void parar(){

    }

    public int getPontos() {
        return pontos;
    }

    public List<String> getCartas() {
        return cartas;
    }

    public boolean parou(){
        return parou;
    }
    
}
