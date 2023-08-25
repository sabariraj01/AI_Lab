class asgn2_1 
{
    public static void main(String[]ar)
    {
        int vertices=5;
        Graph o=new Graph(vertices);
        o.add_edge(0,2);
        o.add_edge(1,3);
        o.add_edge(2,1);
        o.add_edge(3,4);

        o.adj_matrix();
        o.adj_list();
    }
}
class list
{
    int value;
    list next;
    list(int val)
    {
        value=val;
        next=null;
    }
}
class Graph
{
    int n;
    int am[][];
    list al[];

    Graph(int n)
    {
        this.n=n;   
        am=new int[n][n];
        al=new list[n];
    }

    void add_edge(int i,int j)
    {
        am[i][j]=1;
        am[j][i]=1;

        list newNodeI = new list(j);
        newNodeI.next = al[i];
        al[i] = newNodeI;
        
        list newNodeJ = new list(i);
        newNodeJ.next = al[j];
        al[j] = newNodeJ;
    }

    void adj_matrix()
    {
        System.out.println("Adjacency matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(am[i][j]+" ");
            }
            System.out.println();
        }
    }

    void adj_list() 
    {
        System.out.println("\nAdjacency list:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(i + " -> ");
            list current = al[i];
            while (current != null) 
            {
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println();
        }
    }


    // void display()
    // {
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<n;j++)
    //         {
    //             if(am[i][j]==1)
    //                 System.out.println(i+"->"+j);
    //         }
    //     }
    // }
}
