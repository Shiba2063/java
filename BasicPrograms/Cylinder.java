public class Cylinder {
    double radius;
    double height;
    void setDimension(double r,double h)
    {
        radius=r;
        height=h;
    }   
    double setradius()
    {
        return radius;
    }
       double setheight()
    {
        return height;
    }
    double Volume()
    {
        return 3.14*radius*radius*height;
    }
    public static void main(String args[])
    {
        Cylinder Cobj=new Cylinder();
        Cobj.setDimension(4.3,5.4);
        System.out.println("Radius:"+Cobj.setradius());
        System.out.println("Height:"+Cobj.setheight());
        System.out.println("Volume:"+Cobj.Volume());
    }    

    private void setDimention(double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
