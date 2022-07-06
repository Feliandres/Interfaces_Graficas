import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
    /*
        // Mostrar un dialogo
        // JOptionPane.showMessageDialog(null,"Bienvenidos");
        // Pedir datos a travez de una interfaz grafica
        // JOptionPane.showInputDialog(null, "Introduzca un dato: ")
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el primer numero: ","Sumando",JOptionPane.QUESTION_MESSAGE));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el segundo numero: ","Sumando",JOptionPane.QUESTION_MESSAGE));
        int total = numero1 + numero2;
        JOptionPane.showMessageDialog(null,"El resultado es: "+total,"Sumando",JOptionPane.INFORMATION_MESSAGE);
        // System.out.println(numero1+numero2);
    */


    /*
        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca el peso en (kg) : ","Calculo IMC",JOptionPane.QUESTION_MESSAGE));
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca la altura en (m): ","Calculo IMC",JOptionPane.QUESTION_MESSAGE));
        float IMC = peso/(altura*altura);
        JOptionPane.showMessageDialog(null,"El IMC es: "+IMC,"Calculo IMC",JOptionPane.INFORMATION_MESSAGE);
    */

        ArrayList<Estudiantes> estudiante = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num_est = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de estudiantes: ","Estudiantes",JOptionPane.QUESTION_MESSAGE));


        for (int i=0; i< num_est;i++){
            String nombre = JOptionPane.showInputDialog(null,"Nombre: ","Estudiante"+(i+1),JOptionPane.QUESTION_MESSAGE);
            String curso = JOptionPane.showInputDialog(null,"Curso: ","Estudiante"+(i+1),JOptionPane.QUESTION_MESSAGE);
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad: ","Estudiante"+(i+1),JOptionPane.QUESTION_MESSAGE));
            String asignatura = JOptionPane.showInputDialog(null,"Asignatura: ","Estudiante"+(i+1),JOptionPane.QUESTION_MESSAGE);
            String carrera = JOptionPane.showInputDialog(null,"Carrera: ","Estudiante"+(i+1),JOptionPane.QUESTION_MESSAGE);
            estudiante.add(new Estudiantes(nombre,curso,edad,asignatura,carrera));
        }

        for (Estudiantes estudiantes: estudiante) {
            estudiantes.mostrarDatos();
        }


    }
}
