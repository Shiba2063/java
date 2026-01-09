
public class fruit{
    String name;
    String taste;
    String size;
    fruit(String n,String t,String s)
    {
        name=n;
        taste=t;
        size=s;
    }   
    public void eat()
    {
        System.out.println(name+"is"+taste);
    }
}
 class Apple extends fruit
{
  super.eat();
}
  class Orange extends fruit
{
  super.eat();

  }
 
    public static void main(String[] args) {
        orange obj=new fruit("Orange","sweet","small");
        obj.eat();
        Apple aobj=new fruit("Apple","sour","large");
        aobj.eat();
    }
}     
    
    

