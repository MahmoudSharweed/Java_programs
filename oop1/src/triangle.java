public class triangle {
   private float x;
   private float y;
   private float z;

    public double circumference(float x,float y ,float Hypotenuse) {
        this.x=x;
        this.y=y;
        this.z=Hypotenuse;
        return (x+y+z);
    }
    public double area(float x,float y,float Hypotenuse){
        this.x=x;
        this.y=y;
        this.z=Hypotenuse;
         return (0.5*x*y);

    }
}
