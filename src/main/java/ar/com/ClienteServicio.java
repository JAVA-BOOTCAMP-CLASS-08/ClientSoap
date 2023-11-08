package ar.com;

import ar.com.cxf.matematica.DivisionPorZeroException;
import ar.com.cxf.matematica.OperacionesMatematicas;
import ar.com.sicos.service.OperacionesMatematicasImplService;

import java.util.stream.Stream;

public class ClienteServicio {

    private final String KEY = this.getClass().getSimpleName() + " --> ";

    void ejecutarServicio() {
        OperacionesMatematicasImplService op = new OperacionesMatematicasImplService();

        OperacionesMatematicas operaciones = op.getOperacionesMatematicasImplPort();

        Stream.of(new int[] {10, 2},
                new int[] {15, 3},
                new int[] {20, 10})
                .forEach(arr -> {
                    System.out.printf("%s %d + %d = %d %n", KEY, arr[0], arr[1], operaciones.suma(arr[0], arr[1]));
                    System.out.printf("%s %d - %d = %d %n", KEY, arr[0], arr[1], operaciones.resta(arr[0], arr[1]));
                    System.out.printf("%s %d * %d = %d %n", KEY, arr[0], arr[1], operaciones.producto(arr[0], arr[1]));
                    try {
                        System.out.printf("%s %d / %d = %d %n", KEY, arr[0], arr[1], operaciones.division(arr[0], arr[1]));
                    } catch (DivisionPorZeroException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("-----------------------------------------");
                });

    }

    public static void main(String[] args) {
        ClienteServicio clienteServicio = new ClienteServicio();

        clienteServicio.ejecutarServicio();
    }
}
