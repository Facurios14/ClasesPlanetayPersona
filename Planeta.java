public class Planeta {
    // Atributos
    String nombre = null;
    int cantidadSatélites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaMediaAlSol = 0;
    TipoPlaneta tipoPlaneta;
    boolean observableAVista = false;
    // Nuevos atributos
    double periodoOrbital = 0; // en años
    int periodoRotacion = 0;   // en días

    // Enum TipoPlaneta
    public enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    // Constructor
    public Planeta(String nombre, int cantidadSatélites, double masa, double volumen, int diametro,
                   int distanciaMediaAlSol, TipoPlaneta tipoPlaneta, boolean observableAVista,
                   double periodoOrbital, int periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatélites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipoPlaneta = tipoPlaneta;
        this.observableAVista = observableAVista;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    // Método para imprimir los valores de los atributos
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSatélites);
        System.out.println("Masa (kg): " + masa);
        System.out.println("Volumen (km³): " + volumen);
        System.out.println("Diámetro (km): " + diametro);
        System.out.println("Distancia Media al Sol (millones de km): " + distanciaMediaAlSol);
        System.out.println("Tipo de Planeta: " + tipoPlaneta);
        System.out.println("Observable a simple vista: " + observableAVista);
        System.out.println("Periodo Orbital (años): " + periodoOrbital);
        System.out.println("Periodo de Rotación (días): " + periodoRotacion);
    }

    // Método para calcular la densidad del planeta (masa/volumen)
    public double calcularDensidad() {
        if (volumen != 0) {
            return masa / volumen;
        }
        return 0; // Evitar división por cero
    }

    // Método para determinar si el planeta es exterior (más allá del cinturón de asteroides)
    public boolean esPlanetaExterior() {
        final double CINTURON_ASTEROIDES_INFERIOR = 2.1; // UA
        final double CINTURON_ASTEROIDES_SUPERIOR = 3.4; // UA
        double distanciaEnUA = distanciaMediaAlSol / 149.597870; // Conversión de km a UA
        return distanciaEnUA > CINTURON_ASTEROIDES_SUPERIOR;
    }

    // Método main para crear dos planetas y mostrar sus datos
    public static void main(String[] args) {
        // Crear dos objetos Planeta
        Planeta planeta1 = new Planeta("Júpiter", 79, 1.898 * Math.pow(10, 27), 1.431 * Math.pow(10, 15), 139820, 778.5,
                TipoPlaneta.GASEOSO, true, 11.86, 9.9);
        Planeta planeta2 = new Planeta("Tierra", 1, 5.972 * Math.pow(10, 24), 1.08321 * Math.pow(10, 12), 12742, 1,
                TipoPlaneta.TERRESTRE, true, 1, 1);

        // Mostrar los datos de los planetas
        System.out.println("Datos de Planeta 1:");
        planeta1.imprimirDatos();
        System.out.println("Densidad de Planeta 1: " + planeta1.calcularDensidad() + " kg/km³");
        System.out.println("¿Es un planeta exterior? " + planeta1.esPlanetaExterior());
        System.out.println("\nDatos de Planeta 2:");
        planeta2.imprimirDatos();
        System.out.println("Densidad de Planeta 2: " + planeta2.calcularDensidad() + " kg/km³");
        System.out.println("¿Es un planeta exterior? " + planeta2.esPlanetaExterior());
    }
}

