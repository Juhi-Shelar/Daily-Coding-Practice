import java.lang.*;
import java.util.*;

public class Saviours{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int t=0;
        
        t=s.nextInt();
        
        String res[]= new String[t];
        int ind=0;
        
        for(int j=0;j<t;j++)
        {
        String str=s.next();
        
        int len=str.length();
        char[] ch=new char[str.length()];
        ch=str.toCharArray();
        boolean stat=false;
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        if(ch[0]=='0'){
            res[ind]="NO";
            ind++;
            stat=true;
        }
       else if(str.substring(len-3,len).equals("000"))
        {
    	   res[ind]="NO";
           ind++;
           stat=true;
        }
       else{
        
           for(int i=0;i<ch.length;i++)
           {
               if(ch[i]=='*')
               {  
                   int l=arr.lastIndexOf('*');
                   if(l!=-1)
                   {
                       if(i-l>3)
                       {
                    	   res[ind]="NO";
                           ind++;
                           
                           stat=true;
                            break;
                       }
                   }
                   arr.add(i);
                   
               }
           }
           
              
           }
           if(stat==false)
           {
               
        	   res[ind]="YES";
               ind++;
               
           }
        
     }
        
        
        for(int i=0;i<ind;i++)
        	System.out.println(res[i]);
        	
}
}