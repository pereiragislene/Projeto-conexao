Escreva um programa para ler 3 notas de um aluno e informar se o aluno está aprovado, reprovado ou se deverá fazer a prova final.

O aluno será Aprovado a média de suas notas for > 6
O aluno será Reprovado se a média de suas notas for < 4
O aluno deverá fazer a prova se a média de suas notas for >= 4 e < 6


Média das notas: (Nota1 + Nota2 + Nota3) / 3

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
