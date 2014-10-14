/*cons destruc , metodos de acceso*/
package boletin0.pkg6;

/**
 *
 * @author aferreiradominguez
 */
public class Boletin06 {

    public static void main(String[] args) {
    Rectangulo rectangulo1=new Rectangulo();
    Rectangulo rectangulo2=new Rectangulo("azul",4,8);
    //visualizo base e a cor dos dous
        System.out.println("cor "+rectangulo1.cor+"\n"+"base= "+rectangulo1.getBase());
        System.out.println("cor "+rectangulo2.cor+"\n"+"base= "+rectangulo2.getBase());
        System.out.println("area= "+rectangulo2.calcularArea(rectangulo2.getBase(),rectangulo2.getaltura()));
        //doulle valor 10 a base do R2
        rectangulo2.setBase(10);
        System.out.println("area nova "+rectangulo2.calcularArea());
        rectangulo2.calcularPerimetro(rectangulo2.getBase(), rectangulo2.getaltura());
        
        
        
        
        
    }
    
}
