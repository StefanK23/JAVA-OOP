package Animals;

public class Cat extends Animal {


    public Cat(String name, String favoriteFood) {
        super(name, favoriteFood);

    }

    @Override
    public String explainSelf() {
        return "I am " + getName() + " and my favourite food is " + getFavouriteFood() + System.lineSeparator() +
                "MEEOW";
    }
}
