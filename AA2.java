import java.util.*;
class data
{
    
    Treeset<string>xx=new Treeset<string>();
    Treeset<string>xx1=new Treeset<string>();
    Treeset<string>xx2=new Treeset<string>();
    Treeset<string>xx3=new Treeset<string>();
    Treeset<string>xx4=new Treeset<string>();
    Scanner z=new Scanner(System.in);
    void getxx(int num)
    {
        string a;
        System.out.println("Enter the element");
        for(int i=1;i<=num;i++)
        {
            a=s.nextLine();
            xx.add(a);
            System.out.println("Element add successfully");
            if(i!=num)
            {System.out.println("Enter next ele");
            }
        }
    }
    void getXX1(int num)
    {
        string a;
        System.out.println("Enter the element");
        for(int i=1;i<=num;i++)
        {
            a=s.nextLine();
            xx.add(a);
            System.out.println("Element add successfully");
            if(i!=num)
            {System.out.println("Enter next ele");
            }
        }
        void deleteXX(int num)
        {

            String ele;
            System.out.println("Enter element");
            for(int i=1;i<num;i++)
            {
                element=z.nextLine();
                if(xx.contains (element)==true)
                {
                    xx.remove(ele);
                    System.out.println("Element delete successfully");
                    if(i!num)
                    {
                        System.out.printlm("Enter next element");

                    }
                    
                }
                else{

                    system.out,println("Element it not exit in set1")

                    if(i!=num)
                    {
                        System.out.println("Enter next element")
                    }
                }
            }
        }
        class main
        {
            public static void main(String args[] )
            {
                int ch,ch1,ch2;

                String ans="Y";
                String ele;
                data x=new data();
                Scanner z=new Scanner(System.in);
                Scanner zz=new Scanner(System.in);
                
            }
        }
}