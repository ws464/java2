public class Dog extends Animal{
    private String name="";
        private byte age=-1;
        private int id=-1;
        private static int dogCount=0;
        public Dog(){
            dogCount++;
        }
        public Dog(String first, String last){
            this.name = first+" "+last;
            dogCount++;
        }
        public Dog(String first, String last, byte age, int id){
            this.name = first+" "+last;
            this.age=age;
            this.id=id; 
            dogCount++;
        }
        public String speak(){
            if(name.equals("")){
                 return "Woof woof woof woof woof.";
            }
            else if(age==-1){
                return String.format("Woof woof woof %s", this.name);
            }
            else{
                return String.format("Woof woof woof %s woof woof woof %d woof woof.", this.name, this.age);
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
        public static int getDogCount(){
            return dogCount;
        }
}
