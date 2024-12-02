package main;

import Builder.*;

public class BuilderExample {
    public static void main(String[] args) {
        // Diretor
        SandwichBuilder sandwichBuilder = new SandwichBuilder();

        // Builder para VeggieSandwich
        VeggieSandwich veggieBuilder = new VeggieSandwich();
        sandwichBuilder.makeSandwich(veggieBuilder);
        product.MakeSandwich veggieMakeSandwich = veggieBuilder.getResult();
        veggieMakeSandwich.display();

        // Builder para ChickenSandwich
        ChickenSandwich chickenBuilder = new ChickenSandwich();
        sandwichBuilder.makeSandwich(chickenBuilder);
        product.MakeSandwich chickenMakeSandwich = chickenBuilder.getResult();
        chickenMakeSandwich.display();
    }
}
