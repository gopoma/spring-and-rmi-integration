package sd.rmi.integration;

import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) {
        try{
            CalculatorService service = (CalculatorService) Naming.lookup("rmi://localhost/CalculatorService");

            int sumResult = service.add(5, 3);
            int subtractResult = service.subtract(5, 3);

            System.out.println("Resultado de la suma: " + sumResult);
            System.out.println("Resultado de la resta: " + subtractResult);
        }catch(Exception e) {
            System.err.println("Error del cliente RMI: " + e);
        }
    }
}
