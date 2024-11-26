public class Persona {
    // Atributos
    String nombre;
    String apellido;
    String numeroDocumento;
    int añoNacimiento;
    String paisNacimiento; // Nuevo atributo
    char genero;           // Nuevo atributo

    // Constructor modificado
    public Persona(String nombre, String apellido, String numeroDocumento, int añoNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    // Método para imprimir los valores de los atributos
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de Documento: " + numeroDocumento);
        System.out.println("Año de Nacimiento: " + añoNacimiento);
        System.out.println("País de Nacimiento: " + paisNacimiento);
        System.out.println("Género: " + (genero == 'H' ? "Hombre" : "Mujer"));
    }

    // Método main para crear dos personas y mostrar sus datos
    public static void main(String[] args) {
        // Crear dos objetos Persona con los nuevos atributos
        Persona persona1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "Argentina", 'H');
        Persona persona2 = new Persona("Luis", "León", "1053223344", 2001, "España", 'M');

        // Mostrar los datos de las personas
        System.out.println("Datos de Persona 1:");
        persona1.imprimirDatos();
        System.out.println("\nDatos de Persona 2:");
        persona2.imprimirDatos();
    }
}


