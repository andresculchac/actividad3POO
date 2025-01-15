/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciop19;

/**
 *
 * @author AndresYamith
 */
public class TEquilatero {
    int lado; // Atributo que define el lado de un Triángulo equilátero

    TEquilatero(int lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
    }

    double calcularHipotenusa() {
        return (lado * Math.sqrt(3)) / 2;
    }

    double calcularPerimetro() {
        return 3 * lado;
    }
}
