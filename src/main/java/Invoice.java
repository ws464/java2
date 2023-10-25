import java.util.ArrayList;

public class Invoice{
    private String name, address, city, state;
    private int zip;
    private ArrayList<Item> items;
    private float total;
    private float shippingCharge;
    public Invoice(String name, String address, String city, String state, int zip, ArrayList<Item> items, float total, float shippingCharge){
        this.items=items; this.total=total; this.shippingCharge=shippingCharge;
        this.name=name; this.address=address; this.city=city; this.state=state; this.zip=zip; 
    }
    public String toString(){
        String ret="";
        ret+= String.format("Ship to:\n   %s\n   %s\n   %s, %s %d\n\nItems\n----\n", name, address, city, state, zip);
        for(Item i : this.items){
            ret+=i.toString()+"\n";
        }
        if(total-shippingCharge>5.00){
            ret+="Shipping: Free\n\n";
        }
        else{
            ret+="Shipping: "+shippingCharge+"\n\n";
        }
        ret+="Total Cost\n---------\n$"+total;
        return ret;   
    }
}
