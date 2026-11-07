package pe.edu.pucp.iweb.lab8.beans;

/**
 * Ejercicio 2: bean Cancion.
 */
public class Cancion {

    // TODO: atributos idCancion, titulo, artista, duracionSeg, anio
    //          y genero (de tipo Genero)

    private int idCancion;
    private String titulo;
    private String artista;
    private int duracionSeg;
    private int anio;
    private Genero genero;


    // TODO: getters y setters


    public Cancion() {}

    public Cancion(int idCancion, String titulo, String artista, int duracionSeg, int anio, Genero genero) {
        this.idCancion = idCancion;
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSeg = duracionSeg;
        this.anio = anio;
        this.genero = genero;
    }

    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracionSeg() {
        return duracionSeg;
    }

    public void setDuracionSeg(int duracionSeg) {
        this.duracionSeg = duracionSeg;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * TODO: retornar la duración en formato m:ss
     *          (354 segundos -> "5:54", 200 segundos -> "3:20").
     */
    public String getDuracionFormateada() {
        return null;
    }
}
