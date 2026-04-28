import java.util.concurrent.Callable;

import javax.management.RuntimeErrorException;

import models.Results;


public class BenchMarking {
    public static Results medirTiempos(Callable<Void> funcion){
        try {
        // Calcular tiempo inicio
        long inicio = System.nanoTime();
        // Ejecutar la funcion
        funcion.call();
        // Calcular tiempo fin
        long fin = System.nanoTime();
        double duracion = (fin - inicio) /100_000;
        // Calcular tiempo ejecucion
        // Devolver resultados
            Results results = new Results(duracion);
            return results;

        } catch (Exception e) {
            throw new RuntimeException("Error en la funcion");
            // System.out.println("Error en la funcion");
            // return null;
        }
    }
}
