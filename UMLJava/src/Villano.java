public class Villano {
    private Personaje personaje;

    public Villano(Personaje personaje) {
        this.personaje = personaje;
    }

    public void atacar(Personaje objetivo) {
        System.out.println(personaje.nombre + " está atacando a " + objetivo.nombre + " con su poder de " + personaje.poder);
        objetivo.recibirAtaque(personaje.poder);
    }

    public void destruir() {
        System.out.println(personaje.nombre + " está causando destrucción.");
    }
}

class Main {
    public static void main(String[] args) {
        Elfo elfo = new Elfo("Elfo", "un agil arquero", "Pequeño", 80, 100);
        Enano enano = new Enano("Enano", "un valiente guerrero", "Mediano", 90, 120);
        Humano humano = new Humano("Humano", "el rey de gondor", "Mediano", 100, 150);
        Ogro ogro = new Ogro("Ogro", "un poderoso ogro", "Grande", 120, 200);
        Duende duende = new Duende("Duende", "un astuto hechicero", "Pequeño", 110, 80);

        Heroe heroe = new Heroe(elfo);
        Villano villano = new Villano(ogro);

        heroe.atacar(duende);
        villano.atacar(humano);
        heroe.defender();
    }
}
