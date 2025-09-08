/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

/**
 *
 * @author u1845853
 */
public class Somar {
    public int soma(int num1, int num2) {
        return num1 + num2;
    }
    public int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public int soma(int ... numeros) {
        int res = 0;
        for (int i = 0; i < numeros.length; i++) {
            res = res + numeros[i];            
        }
        return res;
    }
    
    public static void main(String[] args) {
        Somar somar = new Somar();
        System.out.println("soma:"+ somar.soma(4,21,41656,645,6547,89765,4,78,9789,7));
       
    }
}
