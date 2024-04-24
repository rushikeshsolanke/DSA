}

    // Return Intersection of sets

    public void intersection(Set s)
    {
        Set temp = new Set();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if (set[i]==s.set[j])
                {
                    temp.add_element(set[i]);
                }
            }
        }
        System.out.println("Intersection  of both sets is : ");
        temp.display();
    }

    // Return Union of sets

    public void union(Set s)
    {
        Set temp = new Set();
        for(int i=0;i<size;i++)
        {
            temp.add_element(set[i]);
        }
        for(int i=0;i<size;i++)
        {
            temp.add_element(s.set[i]);
        }

        System.out.println("Union  of both sets is : ");
        temp.display();
    }

    // Return Difference of sets

    public void difference(Set s)
    {
        Set temp = new Set();
        for(int k=0;k<size;k++)
        {
            temp.set[k]=set[k];
        }

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if (temp.set[i]==s.set[j])
                {
                    temp.remove_element(temp.set[i]);
                }
            }
        }
        System.out.println("Difference of both sets is : ");
        temp.display();
    }

    // Display the set
    
    public void display()
    {
        System.out.println("  +--------------+  ");
        for(int i=0;i<size;i++)
        {   if(set[i]!=0)
                System.out.println("  |     "+ set[i] +"      |  ");
        }
        System.out.println("  +--------------+  ");
    }
}
