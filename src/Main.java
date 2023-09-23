import entity.Client;
import record_entity.ClientRecord;

public class Main {

    public static void main(String[] args) {

        // Creating an Object the Client class
        Client client1 = new Client(101, "Mark", "Anderson", "42 Java Street", "0001111", "mark.a@gmail.com");
        Client client2 = new Client(102, "Dean", "Becker", "42 Java Street", "0001111", "mark.a@gmail.com");

        // Displaying the Client Details
        System.out.println("First Client details: " + client1);
        System.out.println("Second Client details: " + client2);

        System.out.println();

        // Creating an Object the ClientRecord class
        ClientRecord client3 = new ClientRecord(101, "Mark", "Anderson", "42 Java Street", "0001111", "mark.a@gmail.com");
        ClientRecord client4 = new ClientRecord(102, "Dean", "Becker", "42 Java Street", "0001111", "mark.a@gmail.com");

        // Displaying the ClientRecord Details
        System.out.println("Third ClientRecord details: " + client3);
        System.out.println("Fourth ClientRecord details: " + client4);

        // Creating two objects of ClientRecord
        ClientRecord client5 = new ClientRecord(104, "John", "Doe", "42 Java Street", "0001111", "mark.a@gmail.com");
        ClientRecord client6 = new ClientRecord(104, "John", "Doe", "42 Java Street", "0001111", "mark.a@gmail.com");

        // Checking for the two Object's hashnode
        System.out.println("client5 hashnode is: " + client5.hashCode());
        System.out.println("client6 hashnode is: " + client6.hashCode());

        // Checking for Object's equals function
        System.out.println("Are the two objects of the same type? " + client5.equals(client6));


    }
}
