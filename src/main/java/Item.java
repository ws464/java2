public class Item{
        private float price;
        private String name;
        private int quantity;
        public Item(float price, int quantity, String name){
            this.price=price;this.quantity=quantity; this.name=name;
        }
        public String toString(){
            return this.name;
        }
        public float totalPrice(){
            return price*quantity;
        }
    }