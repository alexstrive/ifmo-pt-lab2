package ifmo.pt.lab2;

import java.util.Date;
import java.util.LinkedList;

class FoodItem extends GenericItem {

    Date dateOfIncome;
    short expires;

    FoodItem(int ID, String name, float price, Category category, Date dateOfIncome, short expires) {
        super(ID, name, price, category);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    @Override
    public String toString() {
        return String.format("%s | DateOfIncome: %s | Expires: %s", super.toString(), this.dateOfIncome, this.expires);
    }

    // can be removed due redundancy
    @Override
    void printAll() {
        super.printAll();
    }

    @Override
    protected Object clone() {
        FoodItem item = new FoodItem(this.ID, this.name, this.price, this.category, this.dateOfIncome, this.expires);
        item.analogIds = (LinkedList<Integer>) this.analogIds.clone();
        return item;
    }

}