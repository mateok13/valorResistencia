/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Resistencia {
 
    public Resistencia() {
       
    }
 
    public int obtenerValor(String color){
        switch(color){
            case "Negro": return 0;
            case "Marron": return 1;
            case "Rojo": return 2;
            case "Naranja": return 3;
            case "Amarillo": return 4;
            case "Verde": return 5;
            case "Azul": return 6;
            case "Violeta": return 7;
            case "Gris": return 8;
            case "Blanco": return 9;
        }
        return -1;
    }
    
    public double obtenerMultiplicador(String color){
        switch(color){
            case "Negro": return 1;
            case "Marron": return 10;
            case "Rojo": return 100;
            case "Naranja": return 1000;
            case "Amarillo": return 10000;
            case "Verde": return 100000;
            case "Azul": return 1000000;
            case "Violeta": return 10000000;
            case "Dorado": return 0.1;
            case "Plateado": return 0.01;
        }
        return 0;
    }
    
    public double obtenerTolerancia(String color){
        switch(color){
            case "Marron": return 1;
            case "Rojo": return 2;
            case "Verde": return 0.5;
            case "Azul": return 0.25;
            case "Violeta": return 0.10;
            case "Gris": return 0.05;
            case "Dorado": return 5;
            case "Plateado": return 10;
        }
        return 20;
    }
}
