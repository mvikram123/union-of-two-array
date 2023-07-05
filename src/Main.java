import java.util.*;

class UnionAndIntersec{
    public static List<Integer> uAndInter(int arr1[],int arr2[], int m, int n)
    {
        Set<Integer> unique=new HashSet<>();
        // Remove the duplicates from arr1[]
        for(int i:arr1){
            unique.add(i);
        }


        // Remove the duplicates from arr2[]
        for(int j:arr2){
            unique.add(j);
        }
        List<Integer> list=new LinkedList<>();
        for(Integer l:unique)
        {
            list.add(l);
        }
        return list;
    }
}


public class Main
{
    public static void main(String[] args) {
        //	System.out.println("Hello World");
        int arr1[]={ 4, 5, 6, 8, 9};
        int arr2[]={ 4, 5, 6, 8, 9,10};
        int n=arr1.length;
        int m=arr2.length;
        List<Integer> unique=new ArrayList<>(UnionAndIntersec.uAndInter(arr1,arr2,n,m));
        for(int i:unique){
            System.out.print(i+" ");
        }
    }
}
