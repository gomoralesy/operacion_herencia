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

        System.out.println("============================");

        Dispositivo dispositivoUno = new Proyector("Proyector Sala 201", true);
        Dispositivo dispositivoDos = new Computador("Computador Sala 205", true);
        Dispositivo dispositivoTres = new Impresora("Impresora Sala 220", true);

        dispositivoUno.ejecutarDiagnostico();
        dispositivoDos.ejecutarDiagnostico();
        dispositivoTres.ejecutarDiagnostico();

        dispositivoUno.mostrarEstado();
        dispositivoDos.mostrarEstado();
        dispositivoTres.mostrarEstado();
    }
}