public class Square extends Shape {
    private int height;
    public Square(int height){
        this.height=height;
    }
    public String draw(){
        String ret="";
        for(int i = 1; i<=height; i++){
            if(i==1||i==height){
                ret+="*".repeat(height)+"\n";
            }
            else{
                ret+="*"+" ".repeat(height-2)+"*\n";
            }
        }
        return ret;
    }
}
