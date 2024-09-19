public class Pelicula {
    private String titulo;
    private String director;
    private String genero;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                '}';
    }

    public void reproducir(){
        System.out.println("Reproduciendo la pelicula: "+titulo+ "dirigida por: "+director);
    }
    public void detener(){
        System.out.println("Deteniendo la pelicula" + titulo);
    }



}
