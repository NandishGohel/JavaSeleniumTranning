package SeleniumDemo;

public class StarPattern1 {
    public static void main(String args[])
    {
        int row =9;
        for(int i=1;i<=row;i++) //For row i
        {
            for (int j=1;j<=i;j++) // For column j
            {
                System.out.print("* ");
            }
            System.out.println();// For new line
        }
    }
}
