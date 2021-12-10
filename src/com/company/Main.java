package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int kazanma_pc = 0;
        int kazanma_alperen = 0;
        int bitis = 5;
        System.out.println("BEST OF NİNE");
        System.out.println("Rock=1 Paper=2 Scissor=3");
        while(kazanma_pc < bitis && kazanma_alperen < bitis){
            System.out.println("Choice : ");
            Scanner input = new Scanner(System.in);
            int kullanıcı_tahmini = input.nextInt();
            int pc_tahmini = (int) (Math.random()*3 )+1;
            if(kullanıcı_tahmini == 1) {
                System.out.print("User: Rock ");}
            else if(kullanıcı_tahmini == 2) {
                System.out.print("User: Paper "); }
            else if(kullanıcı_tahmini == 3){
                System.out.print("User: Scissor "); }

            if(pc_tahmini == 1){
                System.out.println("  Pc: Rock ");
            }else if(pc_tahmini == 2){
                System.out.println("  Pc: Paper ");
            }else if(pc_tahmini == 3){
                System.out.println("  Pc: Scissor "); }

            if(kullanıcı_tahmini == 1 && pc_tahmini == 3 || kullanıcı_tahmini == 2 && pc_tahmini == 1 || kullanıcı_tahmini == 3 && pc_tahmini == 2) {
                System.out.println("Alperen won");
                System.out.println("user : "+ kazanma_alperen +"   Pc  :" + kazanma_pc);
                kazanma_alperen++;
            }
            else if(kullanıcı_tahmini == 3 && pc_tahmini == 1 || kullanıcı_tahmini == 1 && pc_tahmini == 2 || kullanıcı_tahmini == 2 && pc_tahmini == 3){
                System.out.println("Pc won");
                System.out.println("user : "+ kazanma_alperen +"   Pc  :" + kazanma_pc);
                kazanma_pc++;}
            else if(kullanıcı_tahmini==pc_tahmini){
                System.out.println("Deuce");
                System.out.println("user : "+ kazanma_alperen +"   Pc  :" + kazanma_pc);
            }
            if(kazanma_alperen == bitis){
                System.out.println("Game Over");
                System.out.println("User destroyed Pc");
            }
            if(kazanma_pc == bitis) {
                System.out.println("Game Over");
                System.out.println("PC finished you");}
        }

        System.out.println("ALPEREN : " + kazanma_alperen + "\nPC : " + kazanma_pc);
    }
}
