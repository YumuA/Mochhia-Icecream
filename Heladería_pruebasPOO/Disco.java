public class Disco {
    private String titulo;
    private String artista;
    private String genero;
    private double precio;

    public Disco(String titulo, String artista, String genero, double precio) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }
}
