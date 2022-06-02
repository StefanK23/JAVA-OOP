
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    //fields
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    //constructor
    public Pizza(String name, int countOfToppings) {
        this.setName(name);
        this.setToppings(countOfToppings);
    }

    private void setName(String name) {
        //невалидно ако е празно или повече от 15 символа
        if(name.trim().isEmpty() || name.length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int count) {
        //броят е валиден ако [0..10]
       if(count >= 0 && count <= 10) {
           this.toppings = new ArrayList<>(count);
       } else {
           throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
       }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        //калории за тесто + калории за всички топинги
        return this.dough.calculateCalories() + this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }
}
