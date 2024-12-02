package Builder;

public class VeggieSandwich implements Sandwich {
    private product.MakeSandwich makeSandwich;

    public VeggieSandwich() {
        this.makeSandwich = new product.MakeSandwich();
    }

    @Override
    public void setBreadType() {
        makeSandwich.setBreadType("Whole Grain");
    }

    @Override
    public void setFilling() {
        makeSandwich.setFilling("Grilled Vegetables");
    }

    @Override
    public product.MakeSandwich getResult() {
        return makeSandwich;
    }
}
