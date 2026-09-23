public class Main {
    public static void main(String[] args) {

        Proyector proyectorUno = new Proyector("Proyector Sala 101", true);
        Computador computadorUno = new Computador("Computador Sala 105", true);
        Impresora impresoraUno = new Impresora("Impresora Sala 120", true);

        proyectorUno.ejecutarDiagnostico();
        computadorUno.ejecutarDiagnostico();
        impresoraUno.ejecutarDiagnostico();

        proyectorUno.mostrarEstado();
        computadorUno.mostrarEstado();
        impresoraUno.mostrarEstado();
    }
}