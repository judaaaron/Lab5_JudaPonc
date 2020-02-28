
import java.util.ArrayList;

public class SuperHeroes {

    private String nombre, planeta;
    private int edad, contAtrapados;
    private double altura;
    ArrayList<superPoderes> power = new ArrayList();

    public SuperHeroes() {
    }

    public SuperHeroes(String nombre, String planeta, int edad, int contAtrapados, double altura) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.edad = edad;
        this.contAtrapados = contAtrapados;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getContAtrapados() {
        return contAtrapados;
    }

    public void setContAtrapados(int contAtrapados) {
        this.contAtrapados = contAtrapados;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public ArrayList<superPoderes> getPower() {
        return power;
    }

    public void setPower(ArrayList<superPoderes> power) {
        this.power = power;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }

}
