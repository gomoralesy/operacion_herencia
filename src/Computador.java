public class Computador extends Dispositivo {

    public Computador(String nombre, boolean activo) {
        super(nombre, activo);
    }

    @Override
    public void ejecutarDiagnostico() {
        System.out.println("Verificando sistema operativo y ram...");
    }
}
