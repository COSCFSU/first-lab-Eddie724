/*
 * Steve Kennedy
 * Sept 9/ 2018
 * TianyiGao CSC 310
 */

package tianyigaolab00;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author 37937
 */
public class  TianyiGaoLab00 implements Lab00 {

     public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }
     
  
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }
   
    
    
     public long problem2(int size) {
    LinkedList B = new LinkedList();  
    ArrayList  A = new ArrayList();
    long end vc = System.currentTimeMillis();

        for (int i= 0;i<A.size();i++) {
            A.set(i, Integer.toString(size));
        }
        
        long end = System.currentTimeMillis();
        long firsttime = end - start1;
     long start2 = System.currentTimeMillis();
}
}

    

