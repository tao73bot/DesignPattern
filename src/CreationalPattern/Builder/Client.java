package CreationalPattern.Builder;

public class Client {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder("Medium")
                .addMeat("Beef")
                .addCheese("Cheddar")
                .addTopping("Lettuce")
                .addTopping("Tomato")
                .addTopping("Onion")
                .build();

        System.out.println(burger);
    }
}
