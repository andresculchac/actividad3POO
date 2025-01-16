package Empleados;



public class Nomina {
    //atributos
    private int nhtm;
    private double vht;
    private double retencion;
    //metodos
    
    //metodo constructor
    public Nomina(int nhtm, double vht, double retencion){
        this.nhtm = nhtm;
        this.vht = vht;
        this.retencion = retencion;
    }

    public double CalcularPorcentajeRetencion(){
        return retencion/100.0;
    }
    public double CalcularSalarioBruto() {
        return vht * nhtm;
    }
    public double calcularSalarioNeto(){
        double salarioBruto = CalcularSalarioBruto();
        return salarioBruto-(salarioBruto*CalcularPorcentajeRetencion());
        
    }
        
}
