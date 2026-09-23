public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivoUno = new Dispositivo("celular", true);

        dispositivoUno.mostrarEstado();
        dispositivoUno.ejecutarDiagnostico();
    }
}