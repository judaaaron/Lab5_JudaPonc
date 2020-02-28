
public class superPoderes {

    private int nivel;
    private String descripcion, mortal;

    public superPoderes() {
    }

    public superPoderes(int nivel, String descripcion, String mortal) {
        this.nivel = nivel;
        this.descripcion = descripcion;
        this.mortal = mortal;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMortal() {
        return mortal;
    }

    public void setMortal(String mortal) {
        this.mortal = mortal;
    }

    @Override
    public String toString() {
        return "superPoderes{" + "nivel=" + nivel + ", descripcion=" + descripcion + ", mortal=" + mortal + '}';
    }

}
