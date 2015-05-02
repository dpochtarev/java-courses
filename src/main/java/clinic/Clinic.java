package clinic;


public class Clinic {
    private Client[] clients;


    public static void main(String[] args) {
        Clinic clinic = new Clinic(1);
        clinic.addClient(1, new Client("1", new Pet("Sparky", new Man("Barak"), new Cat())));
    }

    public Clinic(final int size) {
        this.clients = new Client[size];
    }


    public void addClient(final int position, final Client client) {
        if(validate(client))  this.clients[position] = client;
    }


    public Client[] findClientsByPetName(final String name) {

        int number = 0;
        for (Client client : clients) {
            if (name.equals(client.getPetName())) number++;
        }
        Client[] found = new Client[number];

        int i = 0;
        for (Client client : clients) {
            if (name.equals(client.getPetName())) {
                found[i] = client;
                i++;
            }
        }
        return found;
    }

    public Client[] findClientsName(final String name) {

        int number = 0;
        for (Client client : clients) {
            if (name.equals(client.getName())) number++;
        }
        Client[] found = new Client[number];

        int i = 0;
        for (Client client : clients) {
            if (name.equals(client.getName())) {
                found[i] = client;
                i++;
            }
        }
        return found;
    }

    public Client[] removeClient(Client client) {
        Client[] massive = new Client[clients.length - 1];
        int i = 0;
        for (Client element : clients) {
            if (element != client) {
                massive[i] = element;
                i++;
            }
        }
        return massive;
    }

    private boolean validate(Client client) {
        boolean valid = true;
        for (Client element : clients) {
            if (element == client) {
                valid = false;
                System.out.println("This Client already exists!");
            }
        }
        return valid;
    }
}