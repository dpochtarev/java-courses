package clinic;


public class Man implements Animal {
    private String name;

    Man(String name){
        this.name = name;
    }
    public String getName(){
        return name;
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
