package com.example.Jogo;

import com.example.Carta.Carta;
import com.example.Computador.Computador;
import com.example.Jogador.Jogador;
import com.example.Monte.Monte;

public class Jogo {
    
    Monte monte = new Monte();
    Jogador jogador = new Jogador();
    Computador computador = new Computador();

    public Jogo(){
    
    }

    public Carta distribuiCartaParaJogador(){
        return null;
    }

    public boolean acabou(){
        return jogador.parou();
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Computador getComputador() {
        return computador;
    }

}
