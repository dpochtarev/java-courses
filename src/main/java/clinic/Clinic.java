package clinic;


import java.util.HashSet;
import java.util.ArrayList;
public class Clinic {
    private HashSet<Client> clients;


    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        clinic.addClient(1, new Client("1", new Pet("Sparky", new Man("Barak"), new Cat())));
    }

    public Clinic() {
        this.clients = new HashSet<>();
    }


    public void addClient(final int position, final Client client) {
        if(validate(client))  this.clients.add(client);
    }


    public ArrayList<Client> findClientsByPetName(final String name) {

        ArrayList<Client> found = new ArrayList<>();

//        int number = 0;
        for (Client client : clients) {
            if (name.equals(client.getPetName())) found.add(client);
        }
//        Client[] found = new Client[number];
//        int i = 0;
//        for (Client client : clients) {
//            if (name.equals(client.getPetName())) {
//                found[i] = client;
//                i++;
//            }
//        }
        return found;
    }

    public ArrayList<Client> findClientsName(final String name) {

       ArrayList<Client> found = new ArrayList<>();
//        int number = 0;
        for (Client client : clients) {
//            if (name.equals(client.getName())) number++;
              if(name.equals(client.getName())) found.add(client);
        }
//        Client[] found = new Client[number];

//        int i = 0;
//        for (Client client : clients) {
//            if (name.equals(client.getName())) {
//                found[i] = client;
//                i++;
//            }
//        }
        return found;
    }

    public void removeClient(Client client) {
//        Client[] massive = new Client[clients.length - 1];
////        int i = 0;
//        for (Client element : clients) {
//            if (element.equals(client)) {
////                massive[i] = element;
////                i++;
//                clients.remove(element)
//            }
//        }
            this.clients.remove(client);
    }

    private boolean validate(Client client) {
//        boolean valid = true;
//        for (Client element : clients) {
//            if (element.equals(client)) {
//                valid = false;
//                System.out.println("This Client already exists!");
//            }
//        }
       return !(this.clients.contains(client));
//        return valid;
    }
}