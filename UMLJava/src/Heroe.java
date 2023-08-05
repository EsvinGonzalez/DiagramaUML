public class Heroe {
    private Personaje personaje;

    public Heroe(Personaje personaje) {
        this.personaje = personaje;
    }

    public void atacar(Personaje objetivo) {
        System.out.println(personaje.nombre + " está atacando a " + objetivo.nombre + " con su poder de " + personaje.poder);
        objetivo.recibirAtaque(personaje.poder);
    }

    public void defender() {
        System.out.println(personaje.nombre + " está defendiendo.");
    }

    public void recibirAtaque(int poderAtaque) {
        personaje.vida -= poderAtaque;
        System.out.println(personaje.nombre + " recibió un ataque y ahora tiene " + personaje.vida + " puntos de vida.");
    }
}

