package product;

public class MakeSandwich {
    private String breadType;
    private String filling;

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void display() {
        System.out.println("Sandwich with " + breadType + " bread and " + filling + " filling.");
    }
}
