public class Cat extends Animal{
    private String name="";
    private byte age = -1;    
    private int id=-1;
        private static int catCount=0;
        public Cat(){
            catCount++;
        }
        public Cat(String first, String last){
            this.name = first+" "+last;
            catCount++;
        }
        public Cat(String first, String last, byte age, int id){
            this.name = first+" "+last;
            this.age=age;
            this.id=id; 
            catCount++;
        }
        public String speak(){
            if(name.equals("")){
                 return "Meow meow meow meow meow.";
            }
            else if(age==-1){
                return String.format("Meow meow meow %s", this.name);
            }
            else{
                return String.format("Meow meow meow %s meow meow meow %d meow meow.", this.name, this.age);
            }
        }
        public String toString(){
            if(name.equals("")){
                 return "N/A";
            }
            else if(age==-1){
                return this.name;
            }
            else{
                return String.format("%s %d", this.name, this.id);
            }
        }
        public static int getCatCount(){
            return catCount;
        }
}
