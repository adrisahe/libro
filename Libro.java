
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
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro, boolean libroDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = libroDeTexto;
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
        String libroTexto = "no";
        if (esLibroDeTexto == true) {
            libroTexto = "si";
        }
        String detalles = ("Título: " + titulo + "," + " Autor: " + autor + "," + " Páginas: " + numeroPaginas + " Número de referencia: zzz" + " Veces prestado: " + vecesPrestado + " Libro de texto: " + libroTexto);
        if (numeroReferencia.length () >= 3) {
            detalles = ("Título: " + titulo + "," + " Autor: " + autor + "," + " Páginas: " + numeroPaginas + " Número de referencia: " + numeroReferencia + " Veces prestado: " + vecesPrestado + " Libro de texto: " + libroTexto);
        }
        System.out.println (detalles);
    }
    
    public String getDetalles() {
        String libroTexto = "no";
        if (esLibroDeTexto == true) {
            libroTexto = "si";
        }
        String detalles = ("Título: " + titulo + "," + " Autor: " + autor + "," + " Páginas: " + numeroPaginas + " Número de Referencia: zzz" + " Veces prestado: " + vecesPrestado + " Libro de texto: " + libroTexto);
        if (numeroReferencia.length () >= 3 ) {
            detalles = ("Título: " + titulo + "," + " Autor: " + autor + "," + " Páginas: " + numeroPaginas + " Número de referencia: " + numeroReferencia + " Veces prestado: " + vecesPrestado + " Libro de texto: " + libroTexto);
        }
        return detalles;
    }
    
    public String getNumeroReferencia () {
        return numeroReferencia;
    }
    
    public void setNumeroReferencia (String numeroDeReferencia) {
        if (numeroDeReferencia.length () >= 3) {
            numeroReferencia = numeroDeReferencia;
        }
        else {
            System.out.println ("Error al fijar numero de referencia, numero inferior a tres caracteres.");
        }
    }
    
    public void prestar () {
        vecesPrestado = vecesPrestado + 1;
    } 
    
    public int getVecesPrestado () {
        return vecesPrestado;
    }
    
    public boolean getLibroDeTexto () {
        return esLibroDeTexto;
    }
}
