// Java implementation of the above approach
import java.util.*;

class RearrangingCartons 
{
    // Function to return the minimum swaps required
    static int CountSteps(int []s1, int[] s2, int size)
    {
        int i = 0, j = 0;
        int result = 0;

        // Iterate over the first string and convert
        // every element equal to the second string
        while (i < size)
        {
            j = i;

            // Find index element of first string which
            // is equal to the ith element of second string
            while (s1[j] != s2[i])
            {
                j += 1;
            }

            // Swap adjacent elements in first string so
            // that element at ith position becomes equal
            while (i < j)
            {

                // Swap elements using temporary variable
                int temp = s1[j];
                s1[j] = s1[j - 1];
                s1[j - 1] = temp;
                j -= 1;
                result += 1;
            }
            i += 1;
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        int n = sc.nextInt();

        String t1,t2;
        t1 = sc.next();
        t2 = sc.next();

        int a[] = new int[n];
        int b[] = new int[n];

        String aa[] = t1.split(" ");
        String bb[] = t2.split(" ");

        
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(aa[i]);
            b[i] = Integer.parseInt(bb[i]);
        }

        int size = a.length;

        System.out.println(CountSteps(a, b, size));

    }
}

