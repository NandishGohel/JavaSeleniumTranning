package SeleniumDemo;

public class Test1 {
    public static void main(String args[])
    {
        int[] a={2,5,6,99,1,3,45,85,96,4,78,2,56};

        int max=0;// Bydefault 0

        String str = "nandish";
        String str1 ;

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
            if (max <a[i]){
                max=a[i];
            }
        }
        System.out.println("The Largest Element is "+max );

    }
}

