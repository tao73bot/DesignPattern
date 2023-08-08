package CreationalPattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    private String size;
    private String meat;
    private String cheese;
    private List<String> toppings;

    public Burger(String size, String meat, String cheese, List<String> toppings) {
        this.size = size;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Size: " + size + ", Meat: " + meat + ", Cheese: " + cheese + ", Toppings: " + toppings;
    }

    public static class BurgerBuilder {
        private String size;
        private String meat;
        private String cheese;
        private List<String> toppings = new ArrayList<>();

        public BurgerBuilder(String size) {
            this.size = size;
        }

        public BurgerBuilder addMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public BurgerBuilder addCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder addTopping(String topping) {
            toppings.add(topping);
            return this;
        }

        public Burger build() {
            return new Burger(size, meat, cheese, toppings);
        }

    }
}
