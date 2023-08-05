public class Personaje {
    protected String nombre;
    protected String descripcion;
    protected String tamaño;
    protected int poder;
    protected int vida;

    public Personaje(String nombre, String descripcion, String tamaño, int poder, int vida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamaño = tamaño;
        this.poder = poder;
        this.vida = vida;
    }
    public void desplazarse() {
        System.out.println(nombre + " se está desplazando.");
    }

    public void mostrarVida() {
        System.out.println(nombre + " tiene " + vida + " puntos de vida.");
    }

    public void mostrarPoder() {
        System.out.println(nombre + " tiene un poder de " + poder + ".");
    }

    public void recibirAtaque(int poder) {
    }
}
