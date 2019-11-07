
import java.util.*;

public class Saviours
{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        
        //s.nextLine();
        for(int j=0;j<t;j++)
        {
        String str=s.next();
        int len=str.length();
        char[] ch=new char[str.length()];
         ArrayList<Integer> arr=new ArrayList<Integer>();
        ch=str.toCharArray();
        boolean stat=false;
       
        if(ch[0]=='0')
        {
            System.out.println("NO");
            stat=true;
           
        }
       else if(str.substring(len-3,len).equals("000"))
        {
            System.out.println("NO");
            stat=true;
           
        }
       else{
        //System.out.println("here");
        
           for(int i=0;i<ch.length;i++)
           {
               if(ch[i]=='*')
               {   if(arr.size()>=1)
                  {
                   int l=arr.get(arr.size()-1);
                   //System.out.println(l);
                   if(l!=-1)
                   { //System.out.println(l+"l"+i+"i");
                       if(i-l>3)
                       {
                           System.out.println("NO");
                            stat=true;
                            break;
                       }
                   }}
                   arr.add(i);
                   //System.out.println(arr);
                   
               }
           }
              
           }
           if(stat==false)
           {
               System.out.println("YES");
           }
        
     }
}
}
