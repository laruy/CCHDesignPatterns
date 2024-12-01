package Builder;

import product.Sandwich;

public interface MakeSandwich {
    void setBreadType();
    void setFilling();
    Sandwich getResult();
}
