/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoVelha;

import java.util.Scanner;

/**
 *
 * @author mgerm
 */
public class Velha {
    public static void main(String[] args) {
       Scanner pessoa = new Scanner(System.in);
       Tabuleiro jogo = new Tabuleiro();
       int jogador = 1; 
       int vencedor = jogo.vencedor();
       jogo.mostrar();
       
       while(vencedor == 0){
           System.out.println("\nJogador " +jogador);
           System.out.println("Linha: ");
           int linha = pessoa.nextInt();
           System.out.println("Coluna: ");
           int coluna = pessoa.nextInt();
           
           if(!jogo.jogada(jogador, linha -1, coluna -1)){
               System.out.println("Jogada inválida...");
           }else{
               jogador = (jogador == 1) ? 2 : 1;
           }
           jogo.mostrar();
           vencedor = jogo.vencedor();
       }
       switch(vencedor){
           case 1:
               System.out.println("\nVencedor jogador 1");
               break;
           case 2:
               System.out.println("\nVencedor jogador 2");
               break;
           case 3:
               System.out.println("\nEmpate");
               break;
       }
       
    }
}
