public class constructor_overloading {
double side;
double length;
double width;

public constructor_overloading(double side, double length, double width) {
this.side = side;
this.length = length;
this.width = width;
}

public double calArea() {

return side*side;
}

public double calAreas() {
return length * width;
}
constructor_overloading(double a){
this.side=a;
}
constructor_overloading(double b, double c){
this.length=b;
this.width=c;
}
public static void main(String[] args) {
constructor_overloading obj = new constructor_overloading(7.0);
constructor_overloading objj=new constructor_overloading(8.9,7.6);
System.out.println("The area of the area of the shape is "+obj.calArea());
System.out.println("The area of the area of the shape is "+objj.calAreas());

}

}