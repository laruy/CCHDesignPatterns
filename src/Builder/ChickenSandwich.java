package Builder;

public class ChickenSandwich implements Sandwich {
    private product.MakeSandwich makeSandwich;

    public ChickenSandwich() {
        this.makeSandwich = new product.MakeSandwich();
    }

    @Override
    public void setBreadType() {
        makeSandwich.setBreadType("White");
    }

    @Override
    public void setFilling() {
        makeSandwich.setFilling("Chicken and Cheese");
    }

    @Override
    public product.MakeSandwich getResult() {
        return makeSandwich;
    }
}
