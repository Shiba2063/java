class Account {
    String name;
    int accountNO;
    int initial_amount;
    String address;
    String typeof_account;
    int Balance;
    Account(String n,int a,int i)
    {
        name=n;
        accountNO=a;
        initial_amount=i;
    }
    Account(String nh,int an,String add,String type,int b)
    {
      name=nh;
      accountNO=an;
      address=add;
      typeof_account=type;
      Balance=b;
    }
    void Deposit(int amount)
    {
        if(amount>0)
        {
            Balance+=amount;
        }
        else
        {
            System.out.println("Invalid or insufficent balance!!!");
        }    
    }
    void Withdraw(int amount)
    {
        if(amount>0&&amount<=Balance)
        {
            Balance-=amount;
            System.out.println("Withdraw:"+amount);
        }  
        else
        {
            System.out.println("Invalid or insufficent balance!!!");
        }
    }  
    int Get_Balance()
    {
        return Balance;
    }    
//}
//public class AccountDemo
//{
    public static void main(String args[])
    {
        Account obj1=new Account("shiba",123,1000);
        obj1.Deposit(500);
        obj1.Withdraw(250);
        System.out.println("Balance is:"+obj1.Get_Balance());
         Account obj2=new Account("Swikrity",145,"ktm","saving",1000);
         obj2.Deposit(10);
        obj2.Withdraw(25);
         System.out.println("Balance is:"+obj2.Get_Balance());
        
    }
}
                 
