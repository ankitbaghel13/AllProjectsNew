import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *10
  64630 11735 14216 99233 14470 4978 73429 38120 51135 67060 
 *
 *43900.6
  44627.5
  4978
 */
public class Stats {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner  = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int array[] = new int[size];
        long sum=0;
        float mean;
        float median;
        Map<Integer,Integer> modeMap = new TreeMap<>(); 
        int modeMax = 0;
        int mode=Integer.MAX_VALUE;
        
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
            
            if(!modeMap.containsKey(array[i]))
                modeMap.put(array[i],1);
            else
                modeMap.put(array[i],modeMap.get(array[i])+1);
            if(modeMap.get(array[i])>modeMax || (modeMap.get(array[i])==modeMax && array[i]<mode)){
                modeMax = modeMap.get(array[i]);
                mode = array[i];
            }
        }
        
        sum = Arrays.stream(array).sum();
        mean = (float)sum/size;
        
        Arrays.sort(array);
        
        if(size%2!=0)
            median = array[size/2];
        else
            median = (float)(array[size/2]+array[(size/2)-1])/2;
        
        /*for(Map.Entry<Integer,Integer> entry : modeMap.entrySet()){
            
            if((entry.getValue()==modeMax) && entry.getKey()<mode){
                mode = entry.getKey();
            }
        }*/
        
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        
        scanner.close();
    }

}
