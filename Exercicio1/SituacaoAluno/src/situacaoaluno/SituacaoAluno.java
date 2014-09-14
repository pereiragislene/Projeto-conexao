/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package situacaoaluno;

import java.util.Scanner;

/**
 *
 * @author MarcellaIngrid
 */
public class SituacaoAluno {

    public static void main(String[] args) {
        
        int n1,n2,n3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota:");
        n1 = sc.nextInt();
        System.out.println("Digite sua segunda nota:");
        n2 = sc.nextInt();    
        System.out.println("Digite sua terceira nota:");
        n3 = sc.nextInt();
        
        int media = (n1+n2+n3)/3;
        
        if(media >= 6){
            System.out.println("Aluno aprovado");
        }else if(media < 6 && media >= 4){
            System.out.println("Você está na recuperação final");
        }else{
            System.out.println("Reprovado");
        }
        
        
        
            
       
        
       
    
}
}
