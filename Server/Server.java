import java.rmi.*;
import java.rmi.registry.*;

public class Server {
  public static void main(String[] args){
    try {
      // 1. Start the RMI Registry programmatically on port 5000
      System.out.println("Starting RMI registry on port 5000...");
      LocateRegistry.createRegistry(5000);

      // 2. Instantiate your remote object
      Adder adderObject = new AdderRemote();

      // 3. Bind the object instance to the registry
      Naming.rebind("rmi://localhost:5000/rmiserver", adderObject);

      System.out.println("Server is running. AdderRemote is ready!");

    } catch(Exception e) {
      System.out.println("Server Error: " + e);
    }
  }
}