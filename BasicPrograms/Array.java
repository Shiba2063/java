 class Array {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int i,sum=0;
        double Average;
        //sum=arr[0];
        for(i=0;i<5;i++)
        {
            sum+=arr[i];
        }
        Average=sum/5;
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+Average);
    }           
}
