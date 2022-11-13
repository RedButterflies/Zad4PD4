
public class Zad4PD4 {
    static void BubbleSort()
    {
        int [] tablica={500,245,785,2,154,47,65,1001,56,789};
        System.out.println("Tablica przed posortowaniem");
        for( int t: tablica)
        {
            System.out.print(t + " ");
        }
        System.out.println();
        int n = tablica.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(tablica[j-1]>tablica[j])
                {
                    int temp= tablica[j-1];
                    tablica[j-1]=tablica[j];
                    tablica[j]=temp;
                }
            }
        }
        System.out.println("Posortowana tablica");
        for(int t: tablica)
        {
            System.out.print(t + " ");
        }
    }



}
