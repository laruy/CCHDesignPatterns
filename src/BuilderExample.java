package main;

import Builder.*;
import product.Sandwich;

public class BuilderExample {
    public static void main(String[] args) {
        // Diretor
        SandwichBuilder sandwichBuilder = new SandwichBuilder();

        // Builder para VeggieSandwich
        VeggieSandwich veggieBuilder = new VeggieSandwich();
        sandwichBuilder.makeSandwich(veggieBuilder);
        Sandwich veggieSandwich = veggieBuilder.getResult();
        veggieSandwich.display();

        // Builder para ChickenSandwich
        ChickenSandwich chickenBuilder = new ChickenSandwich();
        sandwichBuilder.makeSandwich(chickenBuilder);
        Sandwich chickenSandwich = chickenBuilder.getResult();
        chickenSandwich.display();
    }
}
