package Builder;

import product.Sandwich;

public class VeggieSandwich implements MakeSandwich {
    private Sandwich sandwich;

    public VeggieSandwich() {
        this.sandwich = new Sandwich();
    }

    @Override
    public void setBreadType() {
        sandwich.setBreadType("Whole Grain");
    }

    @Override
    public void setFilling() {
        sandwich.setFilling("Grilled Vegetables");
    }

    @Override
    public Sandwich getResult() {
        return sandwich;
    }
}
