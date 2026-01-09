public class Person {
     String NULL;
    String name;
    int age;
    Person()
    {
      
        name=NULL;
        age=0;
    }
    Person(String n,int a)
    {
        name=n;
        age=a;
    }

    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    } 
    public static void main(String agrs[])
    {
       Person p1=new Person();
        p1.display();
        Person p2=new Person("SHIBA",19);
       p2.display();
    }    

}
