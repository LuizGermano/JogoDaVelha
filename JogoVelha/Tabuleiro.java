/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoVelha;

public class Tabuleiro {
    protected int jogo[][] = new int[3][3];
    
    public Tabuleiro(){
        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                jogo[l][c] = 0;
            }
        }
    }
    
    public void mostrar(){
        for(int l = 0; l < 3; l++){
             System.out.println();
            for(int c = 0; c < 3; c++){
                System.out.print(jogo[l][c]+ "|");
            }
        }
    }
    public int vencedor(){
        for(int l = 0; l < 3; l++){
            if((jogo[l][0] == jogo[l][1]) && (jogo[l][0] == jogo[l][2])){
                if(jogo[l][0] != 0){
             return jogo[l][0];
                }
            }
        }
        for(int c = 0; c < 3; c++){
            if((jogo[0][c] == jogo[1][c]) && (jogo[0][c] == jogo[2][c]) && (jogo[0][0] != 0)){
                return jogo[0][c];
            }
        }
        if((jogo[0][0] == jogo[1][1]) && (jogo[0][0] == jogo[2][2]) && (jogo[0][0] != 0)){
            return jogo[0][0];
        }
        if((jogo[0][2] == jogo[1][1]) && (jogo[0][2] == jogo[2][0]) && (jogo[0][2] != 0)){
            return jogo[0][2];
        }
        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                if(jogo[l][c] == 0){
                    return 0;
                }
            }
        }
        return 3;
    }
    
    public boolean jogada(int jogador, int l, int c){
        if((l < 0)|| (l > 2)){
            return false;
        }
        if((c < 0) || (c > 2)){
            return false;
        }
        if(jogo[l][c] != 0){
            return false;
        }
        jogo[l][c] = jogador;
        return true;
    }
}