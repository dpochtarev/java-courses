package clinic;


public class Client implements Animal{
    private final String id;
    private final Pet pet;
    private String name;

    public Client(String id, Pet pet) {
        this.id = id;
        this.pet = pet;

    }

    public String getPetName(){
       return pet.getName();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat(String food) {

    }

    @Override
    public String makeSound() {
        return null;
    }

    @Override
    public void shit() {

    }

    @Override
    public void fuck() {

    }
}
