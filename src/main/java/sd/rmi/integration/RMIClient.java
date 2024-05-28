package sd.rmi.integration;

import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) {
        try{
            CalculatorService service = (CalculatorService) Naming.lookup("rmi://localhost/CalculatorService");
        }catch(Exception e) {

        }
    }
}
