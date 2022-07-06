import javax.swing.*;

public class Estudiantes {
    private String nombre;
    private String curso;
    private int edad;
    private String asignatura;
    private String carrera;

    public Estudiantes(String nombre, String curso, int edad, String asignatura, String carrera) {
        this.nombre = nombre;
        this.curso = curso;
        this.edad = edad;
        this.asignatura = asignatura;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    /*

    public String toString (){
        return  "DATOS ESTUDIANTE " +
                "\nNombre: "+getNombre()+
                "\nCurso: "+getCurso()+
                "\nEdad: "+getEdad()+"" +
                "\nAsignatura: "+getAsignatura()+"" +
                "\nCarrera: "+getCarrera();
    }*/
    public void mostrarDatos (){
        JOptionPane.showMessageDialog( null,"DATOS ESTUDIANTE " +
                "\nNombre: "+getNombre()+
                "\nCurso: "+getCurso()+
                "\nEdad: "+getEdad()+"" +
                "\nAsignatura: "+getAsignatura()+"" +
                "\nCarrera: "+getCarrera());

    }
}
