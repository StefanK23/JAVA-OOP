package StackOfStrings;
import java.util.ArrayList;
import java.util.List;


public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();

    }

    public void push(String element) {
        this.data.add(element);
    }

    public String pop() {
        String element = "";
        for (int index = 1; index < data.size() -1; index++) {
            element= data.remove(index);
        }
        return element;
    }
//
   public String peek() {
        String getter = "";
       for (String datum : data) {
           getter = datum;
       }

       return getter;
   }
//
   public boolean isEmpty() {
      return this.data.isEmpty();
   }

}
