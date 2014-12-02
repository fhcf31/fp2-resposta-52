/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Fernando
 * @param <T>
 */
public class Equacao2Grau<T extends Number> {
    private T a;
    private T b;
    private T c;
    
//    private Number teste;
//    private double testeDouble;
//    
//    testeDouble = (double) teste;
    
    public Equacao2Grau(T a,T b, T c) {
        if(a.equals(0)){
            throw new NumberFormatException("O coeficiente a não pode ser 0");
        }
        this.a = a;
        this.b = b;
        this.c = c;
}
    
    public T getA(){
        return a;
    }
    public T getB(){
        return b;
    }
    public T getC(){
        return c;
    }
    
    public void setA(T a){
        if(a.equals(0)){
            throw new NumberFormatException("O coeficiente a não pode ser 0");
        }
        this.a = a;
    }
    public void setB(T b){
        this.b = b;
    }
    public void setC(T c){
        this.c = c;
    }
    
    public double getRaiz1(){
        double delta = b.doubleValue()*b.doubleValue() - 4*a.doubleValue()*c.doubleValue();
        
        if(delta < 0){
            throw new NumberFormatException(String.format("A equação (%.1f)x^2+(%.1f)x+(%.1f) não possue raizes reais",
                    a.doubleValue(),b.doubleValue(),c.doubleValue()));
        }
        return (-1)*b.doubleValue() + Math.sqrt(delta);
    }
    
    public double getRaiz2(){
        double delta = b.doubleValue()*b.doubleValue() - 4*a.doubleValue()*c.doubleValue();
        
        if(delta < 0){
            throw new NumberFormatException(String.format("A equação (%.1f)x^2+(%.1f)x+(%.1f) não possue raizes reais",
                    a.doubleValue(),b.doubleValue(),c.doubleValue()));
        }
        return (-1)*b.doubleValue() - Math.sqrt(delta);
    }
}
