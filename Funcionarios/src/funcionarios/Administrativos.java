

package funcionarios;

/**
 *
 * @author MarcellaIngrid
 */
public class Administrativos {
    
    double salarioBase;
    int horaExtra;
    
    public Administrativos(){
        this.salarioBase = 0;
        this.horaExtra = 0;
    }
    
    public Administrativos(double salarioFixo, int horaExtra){
        this.salarioBase = salarioFixo;
        this.horaExtra = horaExtra;
    }

    public double getSalarioFixo() {
        return salarioBase;
    }

    public void setSalarioFixo(double SalarioFixo) {
        this.salarioBase = SalarioFixo;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int HoraExtra) {
        this.horaExtra = HoraExtra;
    }
    
    public double SalarioTotal(){
        double acrescimo = 0.01;
        return salarioBase + (horaExtra * (salarioBase * acrescimo));
        
    }
    
    
    
    }

