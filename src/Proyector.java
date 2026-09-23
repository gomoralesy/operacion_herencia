import java.awt.desktop.SystemSleepEvent;

public class Proyector extends Dispositivo{

    public Proyector(String nombre, boolean activo) {
        super(nombre, activo);
    }

    @Override
    public void ejecutarDiagnostico() {
        System.out.println("Calibrando lente y estado del proyector...");
    }
}
