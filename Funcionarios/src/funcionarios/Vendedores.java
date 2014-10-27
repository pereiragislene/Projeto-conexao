
package funcionarios;

/**
 *
 * @author MarcellaIngrid
 */
public class Vendedores extends Funcionarios{
    
    
    double totalVendas;
    
    Vendedores vendas[] = new Vendedores[5];
    
    public Vendedores(){
       
        this.totalVendas = 0;
    }
    
    public Vendedores(double c_vendas){
       
        this.totalVendas= c_vendas;
    }

    
    public double getC_vendas() {
        return totalVendas;
    }

    public void setC_vendas(double c_vendas) {
        this.totalVendas = c_vendas;
    }
    
    public double acumulaTotalDeVendas(int vendas){
        return totalVendas += vendas;
    }
    public double getSalarioTotal(){
        double percentualDeComissao = 0.05;
        return salarioBase + (totalVendas * percentualDeComissao );
    }
    
    
    
}
