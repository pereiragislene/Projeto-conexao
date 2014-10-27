
package funcionarios;

/**
 *
 * @author MarcellaIngrid
 */
public class Funcionarios {

   private String nome;
   private int RG;
   double salarioBase;
   
  
   
   public Funcionarios(){
       this.nome = new String();
       this.RG = 0;
   }
    
   public Funcionarios(String nome, int RG){
       this.nome = nome;
       this.RG = RG;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
   
}
