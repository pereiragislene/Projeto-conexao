        
package funcionarios;

/**
 *
 * @author MarcellaIngrid
 */
public class Main {
    
    public static void main(String []args){
        Administrativos admin = new Administrativos();
        admin.salarioBase = 1000;
        admin.horaExtra = 3;
        
        System.out.println("seu salario é: "+ admin.SalarioTotal());
        
        Vendedores vendedor = new Vendedores();
        vendedor.salarioBase = 500;
        vendedor.totalVendas = 30;
        
        imprimirSalario(vendedor);
    }

    public static void imprimirSalario(Vendedores vendedor) {
        System.out.println("Seu salario é: " + vendedor.getSalarioTotal());
    }
    
}
