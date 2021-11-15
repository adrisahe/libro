
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String detalles;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
        detalles = ("T�tulo: " + titulo + "," + " Autor: " + autor + "," + " P�ginas: " + numeroPaginas);
    }
    
    public String getAutor () {
        return autor;
    }
    
    public String getTitulo () {
        return titulo;
    }
    
    public void imprimeAutor () {
        System.out.println (autor);
    }
    
    public void imprimeTitulo () {
        System.out.println (titulo);
    }
    
    public int getnumeroPaginas () {
        return numeroPaginas;
    }
    
    public void imprimirDetalles () {
        System.out.println (detalles);
    }
    
    public String getDetalles() {
        return detalles;
    }
}
