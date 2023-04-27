/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Cristian Ortiz
 */
public abstract class Figura {
    protected int n;

    public void setN(int n) {
        this.n = n;
    }
    
    public abstract void imprimir();
}
