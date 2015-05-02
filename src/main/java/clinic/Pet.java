package clinic;


public class Pet {

    private String name;
    private String clientName;
    private Animal animal;

    Pet(String name, Man man, Animal animal){
        this.name = name;
        this.clientName = man.getName();
        this.animal = animal;
    }

    public String getName() {
        return name;
    }


    public void setName(String name){
        this.name = name;
    }


}
