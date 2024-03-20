public class Method_Overloading {
double side;
double length;
double width;

public Method_Overloading(double side, double length, double width) {
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
Method_Overloading(double a){
this.side=a;
}
Method_Overloading(double b,double c){
this.length=b;
this.width=c;
}
public static void main(String[] args) {
Method_Overloading obj = new Method_Overloading(7.0);
Method_Overloading objj=new Method_Overloading(8.9,7.6);
System.out.println("The area of the area of the shape is "+obj.calArea());
System.out.println("The area of the area of the shape is "+objj.calAreas());

}

}