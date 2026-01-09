class Grandpa
{
    int grandpa_amount;
   void Grandpa1(int g)
    {
        grandpa_amount=g;
    }
void display1()
{
    System.out.println("Amount of grandpa:"+grandpa_amount);
}
}
class Parent extends Grandpa
{
    int Parent_amount;
    void Parent1(int p)
    {
        Parent_amount=p;
        Parent_amount+=grandpa_amount;
    }
    void display2()
{
    System.out.println("Amount of parent:"+Parent_amount);
}
}
    class Children extends Parent
    {
        int child_amount;
        void Children1(int c)
        {
            child_amount=c;
            child_amount+=Parent_amount;
        }
        public void display3()
        {
            System.out.println("Amount of children:"+child_amount);
        }    
    }
public class multilevel {
    public static void main(String args[])
    {
        Children cobj= new Children();
        cobj.Grandpa1(100);
        cobj.display1();
        cobj.Parent1(200);
        cobj.display2();
        cobj.Children1(300);
        cobj.display3();
    }    
    
}
