import figuras.Cuadrado1;
import figuras.Triangulo1;

public class FiguraTest {
    public static void main (String []args){
        Cuadrado1 c1 = new Cuadrado1();
        Triangulo1 t1= new Triangulo1();
        
        c1.setN(4);
        c1.imprimir();
        
        t1.setN(4);
        t1.imprimir();
       
        
    }
}
