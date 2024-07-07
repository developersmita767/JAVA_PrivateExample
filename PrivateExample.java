class Car{
    private String color="black";
     void showColor(){
        System.out.println("Color is "+color);
    }
}
public class PrivateExample{
    public static void main(String[] ar){
        Car c = new Car();
       //System.out.println(c.color);
        c.showColor();
    }
}
