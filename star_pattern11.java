import java.io.*;
import java.util.*;
class star_pattern11
    {
        public void main()
        
        {
            int n=7,count=1;
            for(int i =1;i<=n;i++)
            {
            for(int j=1;j<=i;j++)
            {
                if((i+j) % 2 == 0) 
                {
                System.out.print("1");
            }
            else
            {
                System.out.print("0");
            }
            
        }
        System.out.println(" ");
    }
}
}