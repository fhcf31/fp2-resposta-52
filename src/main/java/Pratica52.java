/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fernando
 */
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

public class Pratica52 {
    
    public static void main(String args[]){
        Equacao2Grau primeira = null;
        Equacao2Grau segunda = null;
        Equacao2Grau terceira = null;
        Equacao2Grau quarta = null;
        
        System.out.println("CRIANDO AS EQUAÇÕES:");
        
        try {
            primeira = new Equacao2Grau(0,9,4);
        } catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        
        try {
            segunda = new Equacao2Grau(3,4,1);
        } catch (RuntimeException ex){
            ex.getMessage();
        }
        
        try {
            terceira = new Equacao2Grau(-1,-3.6,3.8);
        } catch (RuntimeException ex){
            ex.getMessage();
        }
        
        try {
            quarta = new Equacao2Grau(1,3,3);
        } catch (RuntimeException ex){
            ex.getMessage();
        }
        
        System.out.println("CALCULANDO AS RAIZES:");
        
        if(primeira != null){
            try{
                System.out.printf("As raizes da equação (%.1f)x^2+(%.1f)x+(%.1f) são %.1f e % .1f\n",
                    primeira.getA().doubleValue(), primeira.getB().doubleValue(),
                    primeira.getC().doubleValue(), primeira.getRaiz1(), primeira.getRaiz2());
            } catch (RuntimeException ex){
                System.out.println(ex.getMessage());
            }
        }
        
        if(segunda != null){
            try{
                System.out.printf("As raizes da equação (%.1f)x^2+(%.1f)x+(%.1f) são %.1f e % .1f\n",
                    segunda.getA().doubleValue(), segunda.getB().doubleValue(),
                    segunda.getC().doubleValue(), segunda.getRaiz1(), segunda.getRaiz2());
            } catch (RuntimeException ex){
                System.out.println(ex.getMessage());
            }
            
        }
        
        if(terceira != null){
            try{
                System.out.printf("As raizes da equação (%.1f)x^2+(%.1f)x+(%.1f) são %.1f e % .1f\n",
                    terceira.getA().doubleValue(), terceira.getB().doubleValue(),
                    terceira.getC().doubleValue(), terceira.getRaiz1(), terceira.getRaiz2());
            } catch (RuntimeException ex){
                System.out.println(ex.getMessage());
            }
        }
        
        if(quarta != null){
            try{
                System.out.printf("As raizes da equação (%.1f)x^2+(%.1f)x+(%.1f) são %.1f e % .1f\n",
                    quarta.getA().doubleValue(), quarta.getB().doubleValue(),
                    quarta.getC().doubleValue(), quarta.getRaiz1(), quarta.getRaiz2());
            } catch (RuntimeException ex){
                System.out.println(ex.getMessage());
            }
        }
        
    
    }
}
