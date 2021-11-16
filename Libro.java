
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

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
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
        String detalles = ("Título: " + titulo + "," + " Autor: " + autor + "," + " Páginas: " + numeroPaginas + " Número de referencia: zzz" + " Veces prestado: " + vecesPrestado);
        if (numeroReferencia.length () >= 3) {
            detalles = ("Título: " + titulo + "," + " Autor: " + autor + "," + " Páginas: " + numeroPaginas + " Número de referencia: " + numeroReferencia + " Veces prestado: " + vecesPrestado);
        }
        System.out.println (detalles);
    }
    
    public String getDetalles() {
        String detalles = ("Título: " + titulo + "," + " Autor: " + autor + "," + " Páginas: " + numeroPaginas + " Número de Referencia: zzz" + " Veces prestado: " + vecesPrestado);
        if (numeroReferencia.length () >= 3 ) {
            detalles = ("Título: " + titulo + "," + " Autor: " + autor + "," + " Páginas: " + numeroPaginas + " Número de referencia: " + numeroReferencia + " Veces prestado: " + vecesPrestado);
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
    
    public void prestar (int setPrestar) {
        vecesPrestado = vecesPrestado + 1;
    } 
    
    public int getVecesPrestado () {
        return vecesPrestado;
    }
}
