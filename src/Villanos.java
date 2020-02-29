
public class Villanos {

    private String nombre, planeta, carcel,tipo;
    private int edad, muertes, superpoderes;
    private double altura;

    public Villanos() {
    }

    public Villanos(String nombre, String planeta, String carcel, String tipo, int edad, int muertes, int superpoderes, double altura) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.carcel = carcel;
        this.tipo = tipo;
        this.edad = edad;
        this.muertes = muertes;
        this.superpoderes = superpoderes;
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

    public int getSuperpoderes() {
        return superpoderes;
    }

    public void setSuperpoderes(int superpoderes) {
        this.superpoderes = superpoderes;
    }
    
    

    public String getCarcel() {
        return carcel;
    }

    public void setCarcel(String carcel) {
        this.carcel = carcel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getMuertes() {
        return muertes;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }

    public double getAltura() {
        return altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
