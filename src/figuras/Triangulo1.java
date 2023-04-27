package figuras;

public class Triangulo1 extends Figura{
    @Override
    public void imprimir(){
        for(int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

   }
   
}
