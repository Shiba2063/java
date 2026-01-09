public class Distance {
    private int feet;
    private float inches;
    Distance(int f,float i)
    {
      feet=f;
      inches=i;
      if(inches>=12)
      {
          feet+=inches/12;
          inches=inches%12;
      }   
    } 
    Distance add(Distance d)
    {
        return new Distance(feet+d.feet,inches+d.inches);
    }
    int compare(Distance d)
    {
        float t1=feet*12+inches;
        float t2=d.feet*12+d.inches;
        if(t1>t2)
        {
            return 1;
        }
       else if(t1<t2)
        {
            return -1;
        }
       else{
        return 0;}
    }
    void display()
    {
        System.out.println(feet+"ft"+inches+"inch");
    }
    public static void main(String args[])
    {
        Distance d1=new Distance(4,5);
        d1.display();
        Distance d2=new Distance(1,3);
        d2.display();
        Distance dsum=d1.add(d2);
        dsum.display();
        int result=d1.compare(d2);
        if(result==1)
        {
            System.out.println("Distance 1 is greater.");
        } 
        else if(result==-1)
        {
            System.out.println("Distance 2 is greater.");
        }   
        
        else
        {
            System.out.println("Both Distance are equal");
        }   
    }
}
