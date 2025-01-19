/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

/**
 *
 * @author andre
 */
public class Condicionales {
    private int numero1; //quiero que estas variables solo sean usadas aqui
    private int numero2;

    public Condicionales(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    
    public String NumeroMayor(){
        if (numero1 > numero2){
            return ("El numero "+numero1+" es mayor que el "+ numero2);
        }else if (numero1 == numero2){
            return("El numero "+numero1+" es igual que el "+ numero2);
        }else {
            return ("El numero "+numero1+" es menor que el "+ numero2);
        }
    }
}
