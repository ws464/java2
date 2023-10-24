import java.util.ArrayList;
public class ShoppingCart {
    private ArrayList<Item> items;
    private float total=(float)0.0;
    public ShoppingCart(){
        items = new ArrayList<Item>();
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void calculateTotal(){
        float total=0;
        for(Item i:items){
            total += i.totalPrice();
        }
        this.total=total;
    }
    public float getTotal(){
        return this.total;
    }
}

