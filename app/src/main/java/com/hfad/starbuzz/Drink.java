package com.hfad.starbuzz;

/**
 * Drink.java
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;
    //drinks is an array of Drinks
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    public static final Drink[] coldDrinks = {
            new Drink("Ginger Ale", "Ginger ale is a carbonated non-alcoholic mixed drink flavoured with ginger in one of two ways.", R.drawable.gingerale),
            new Drink("Coca Cola", "Coca-Cola, or Coke, is a carbonated soft drink produced by The Coca-Cola Company.", R.drawable.cocacola),
            new Drink("Lemonade", "Lemonade is any of various sweetened beverages found throughout the world, all characterized by lemon flavor.", R.drawable.lemonade)
    };

    public static final Drink[] food = {
            new Drink("Burger", "A hamburger, beefburger or burger is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun.", R.drawable.burger),
            new Drink("Pizza", "Pizza is a traditional Italian dish consisting of a yeasted flatbread typically topped with tomato sauce and cheese and baked in an oven. ", R.drawable.pizza),
            new Drink("Pasta", "Pasta is a staple food of traditional Italian cuisine, with the first reference dating to 1154 in Sicily.", R.drawable.pasta)
    };

    //Each Drink has a name, description, and an image resource
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
