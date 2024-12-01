package Builder;

import product.Sandwich;

public class ChickenSandwich implements MakeSandwich {
    private Sandwich sandwich;

    public ChickenSandwich() {
        this.sandwich = new Sandwich();
    }

    @Override
    public void setBreadType() {
        sandwich.setBreadType("White");
    }

    @Override
    public void setFilling() {
        sandwich.setFilling("Chicken and Cheese");
    }

    @Override
    public Sandwich getResult() {
        return sandwich;
    }
}
