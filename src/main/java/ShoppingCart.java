import java.util.ArrayList;
public class ShoppingCart {
    private ArrayList<Item> items;
    private float total=(float)0.0;
    private float shippingCharge = (float)0.0;
    public ShoppingCart(){
        items = new ArrayList<Item>();
    }
    public ShoppingCart(float shippingCharge){
        items = new ArrayList<Item>();
        this.shippingCharge = shippingCharge;
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
        if(!(this.total<(float)5.0)){
            this.total += shippingCharge;
        }
    }
    public float getTotal(){
        return this.total;
    }
    public Invoice shipOrder(String name, String address, String city, String state, int zip){
        return new Invoice(name, address, city, state, zip, items, total, shippingCharge);
    }
}

