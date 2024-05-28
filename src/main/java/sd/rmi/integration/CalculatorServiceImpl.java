package sd.rmi.integration;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServiceImpl extends UnicastRemoteObject implements CalculatorService {

    protected CalculatorServiceImpl() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subtract'");
    }

}
