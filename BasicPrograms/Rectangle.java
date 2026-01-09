class Rectangle {
    int Length;
    int Breadth;
    void getData(int l,int b)
    {
        Length=l;
        Breadth=b;
    }
    void displayArea()
    {
        System.out.println("The area is:"+Length*Breadth);
    }   
        public static void main(String args[])
    {
        Rectangle Robj=new Rectangle();
        Robj.getData(4,5);
        Robj.displayArea();
    } 
    
}
//class RectangleDemo
//{
//    public static void main(String args[])
//    {
//        Rectangle Robj=new Rectangle();
//        Robj.getData(4,5);
//        Robj.displayArea();
//    }    
//
//}