import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ExecutionException;

public class SistemaTurnosSoporte{

    private Queue<String> cola;
    private static final int CAPACIDAD_MAXIMA = 10;

    public SistemaTurnosSoporte() {
        cola = new PriorityQueue<>();
    }

    public boolean registrarTurno(String codigo, String problema) throws Exception {
        this.codigo = codigo;
        this.problema = problema;
        if (cola.size() >= CAPACIDAD_MAXIMA)
            throw new Exception("Llego a la capacidad maxima");
        return false;
    }

    public String verSiguienteTurno() {
        return cola.peek();
    }

    public String atenderSiguienteTurno() {
        return cola.poll();
    }

    public int obtenerCantidadTurnos() {
        return cola.size();
    }

    public int obtenerEspaciosDisponibles() {
        return CAPACIDAD_MAXIMA - cola.size();
    }

    public String mostrarCola() {
        return cola.toString();
    }
}
