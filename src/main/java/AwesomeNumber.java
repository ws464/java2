public class AwesomeNumber {
    private int number;
    public AwesomeNumber(int number){
        this.number=number;
    }
    public int toInt(){
        return this.number;
    }
    public String toString(){
        return ""+this.number;
    }
    public static AwesomeNumber add(AwesomeNumber n1, AwesomeNumber n2){
        return new AwesomeNumber(n1.toInt()+n2.toInt());
    }
    public static AwesomeNumber subtract(AwesomeNumber n1, AwesomeNumber n2){
        return new AwesomeNumber(n1.toInt()-n2.toInt());
    }
}
