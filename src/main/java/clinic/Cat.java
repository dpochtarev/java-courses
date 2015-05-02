package clinic;


public class Cat implements Animal{


    @Override
    public void eat(String food) {
        food = "Here was food";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public void shit() {

    }
    @Override
    public void fuck() {

    }
}
