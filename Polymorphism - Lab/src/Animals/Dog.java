package Animals;

public class Dog extends Animal{


    public Dog(String name, String favoriteFood) {
        super(name,favoriteFood);
    }
    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%n" +
                "DJAAF", getName(), getFavouriteFood());

    }
}
