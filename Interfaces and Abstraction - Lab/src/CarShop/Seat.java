package CarShop;

import java.io.Serializable;

public class Seat extends CarImpl implements Car , Serializable ,Sellable{

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced,Double price) {
        super(model, color, horsePower, countryProduced);

        this.price = price;

    }


    @Override
    public Double getPrice(){
        return price;
    }
}
