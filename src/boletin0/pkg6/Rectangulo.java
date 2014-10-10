
package boletin0.pkg6;

public class Rectangulo {
    public String cor;
    private double base;
    private double altura;
    //constructores
    public Rectangulo(){
    
    }
    public Rectangulo(String c, double b , double al){
        cor=c;
        base=b;
        altura=al;
        }
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
        
    }
    //metodos de acceso get&set (cor é public non precisa metodo de acceso
    public void setBase(double b){
        base = b;
        }
    public double setaltura(){
    return 20;
    }
    public double getBase(){
        return base;
        
    }
}
