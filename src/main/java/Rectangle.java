public class Rectangle extends Shape{
    private int height, length;
    public Rectangle(int length, int height){
        this.length=length; this.height=height;
    }
    public String draw(){
        String ret="";
        for(int i = 1; i<=height; i++){
            if(i==1||i==height){
                ret+="*".repeat(length)+"\n";
            }
            else{
                ret+="*"+" ".repeat(length-2)+"*\n";
            }
        }
        return ret;
    }
}
