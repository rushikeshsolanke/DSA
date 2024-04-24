import java.util.Scanner;
class A1
{
    //linear probing
    public static void LinearProbing(int hash_table[],int data,int total_clients)
    {
        int address=data%total_clients;
        while(true)
        {
            if(hash_table[address]==-1)
            {
                hash_table[address]=data;
                System.out.println("the number "+data+"is placed on position"+address);
                break;
            }
            else
            {
                if(address==9)
                {
                    address=0;
                }
                else{
                    address++;

                }
                }
            }
            }
        



public static void main(String args[])
{
    Scanner read=new Scanner(System.in);
    System.out.println("+.................+");
    System.out.println("Enter the no of clients");
    int total_clients=read.nextInt();
    System.out.println("+....................+");
    int hash_table[]=new int [total_clients];
    for(int i=0;i<total_clients;i++)
    {
        hash_table[i]=-1;
    }
    boolean flag=true;
    while(flag)
    {
        System.out.println("+.....................+");
        System.out.println("add the telephone mo using the linear probing");
        System.out.println("show hash table");
        System.out.println("Exit");
        System.out.println("Select your choice");
        int ch=read.nextInt();
        System.out.println("+..............+");
        switch(ch)
        {
            case(1):
            {
            System.out.println("Enter hte telephone no");
            int data=read.nextInt();
            System.out.println("+...............+");
            LinearProbing(hash_table, data, total_clients);
            break;
        }
           case(2):
        {
            
            for(int i=0;i<total_clients;i++)
            {
                System.out.println(hash_table[i]);

            }
            System.out.println("+..............................+");
            break;

        }
        case(3):
        {
            flag=false;
            System.out.println("Thank you!!!");
            break;
        }
        }

    }
    }
}
