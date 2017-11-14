package com.cice.negocio;

public class Calculadora {
    
    public static int calcular (int a, int b, String op){
        
        int resultado = 0;
        
        switch(op){
            
            case "suma":
                resultado = a + b;
                break;
            case "resta"    :
                resultado = a-b;
                break;
            case "multiplicacion":
                resultado = a*b;
                break;
            case "division":
                resultado = a/b;
                break;
        }
        return resultado;
    }
}
