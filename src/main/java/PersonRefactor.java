public class PersonRefactor extends Animal{
        private byte age=-1;
        private String name="";
        private int id=-1;
        private static int personCount=0;
        public PersonRefactor(){
            personCount++;
        }
        public PersonRefactor(String first, String last){
            this.name = first+" "+last;
            personCount++;
        }
        public PersonRefactor(String first, String last, byte age, int id){
            this.name = first+" "+last;
            this.age=age;
            this.id=id; 
            personCount++;
        }
        public String speak(){
            if(name.equals("")){
                 return "I don't have a name.";
            }
            else if(age==-1){
                return String.format("My name is %s", this.name);
            }
            else{
                return String.format("My name is %s and I am %d years old.", this.name, this.age);
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
        public static int getPersonCount(){
            return personCount;
        }
    }
