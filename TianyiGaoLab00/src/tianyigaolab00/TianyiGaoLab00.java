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
    long start = System.currentTimeMillis();

        for (int i= 0;i<A.size();i++) {
            A.set(i, Integer.toString(size));
        }
        
        long end = System.currentTimeMillis();
        long time1 = start - end;
        
         start = System.currentTimeMillis();
         for (int j = 0;j<size;j++){
             B.add(Integer.toString(j));
         }
         end = System.currentTimeMillis();
         long time2 = start-end;
         
         if(time1>time2){
             System.out.println("Linked List" +(time2-time1));
             return time2;
             
         }
         else if (time1<time2){
             System.out.println("Arraylist"+(time1-time2));
             return time1;
         }
         else{
         return 0;
     }
         
}
}

    

