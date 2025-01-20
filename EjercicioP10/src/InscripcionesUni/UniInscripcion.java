/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InscripcionesUni;

/**
 *
 * @author AndresYamith
 */
public class UniInscripcion {
    int NumInscripcion;
    String Nombres;
    double Patrimonio;
    int EstratoSocial;

    // Constructor de la clase
    public UniInscripcion(int NumInscripcion, String Nombres, double Patrimonio, int EstratoSocial) {
        this.NumInscripcion = NumInscripcion;
        this.Nombres = Nombres;
        this.Patrimonio = Patrimonio;
        this.EstratoSocial = EstratoSocial;
    }

    // Método para calcular el incremento en la matrícula
    public String IncrementoMatricula() {
        int PagoMatricula = 50000; // Valor base de matrícula
        if (Patrimonio > 2000000 && EstratoSocial > 3) {
            PagoMatricula += 0.03 * Patrimonio; // Incremento del 3% según el patrimonio
        }
        return "El estudiante con número de inscripción " + NumInscripcion + 
               " y nombre " + Nombres + 
               " debe pagar: $" + PagoMatricula;
    }
}
