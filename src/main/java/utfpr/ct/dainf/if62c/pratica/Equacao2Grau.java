/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Fernando
 * @param <Number>
 */
public class Equacao2Grau<Number> {
    private Number a;
    private Number b;
    private Number c;
    
    public Equacao2Grau(Number a,Number b, Number c) {
        if(a.equals(0) || b.equals(0) || c.equals(0)){
            throw new NumberFormatException();
        }
        
        this.a = a;
        this.b = b;
        this.c = c;
}
    
    public Number getA(){
        return a;
    }
    public Number getB(){
        return b;
    }
    public Number getC(){
        return c;
    }
    
    public void setA(Number a){
        this.a = a;
    }
    public void setB(Number b){
        this.b = b;
    }
    public void setC(Number c){
        this.c = c;
    }
    
//    public double getRaiz1(Equacao2Grau eq){
//        
//    }
    
}
