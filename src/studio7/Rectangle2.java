public class Rectangle2 {

   private int length;
   private int width;




public Rectangle2(int length, int width) {
    this.length = length;
    this.width = width;
}

public int perimeter() {

    int perimeter = this.length * 2 + this.width * 2;

    return perimeter;
}

public boolean isSquare( ){
    if(this.length == this.width){
        return true;
    }
    else{
        return false;
    }
}
public double getArea(){
    return this.length * this.width;
}
public boolean isSmaller(Rectangle2 r1){
    if(this.getArea() < r1.getArea() ){
        return true;
    }
    else{
        return false;
    }
}
public static void main(String[] args){
    Rectangle2 r1 = new Rectangle2(5,6);
    Rectangle2 r2 = new Rectangle2(3,4);
    System.out.print(r1.isSmaller(r2));

}
}
