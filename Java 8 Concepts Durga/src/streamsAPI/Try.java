package streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Try {

	public static void main(String[] args) {
		  /*double a = 295.04;
          int  b = 300;
          byte c = (byte) a;
          byte d = (byte) b;
          System.out.println(c + " "  + d);*/
		
		/*TreeSet<StringBuffer> t=new  TreeSet<StringBuffer> ();
        t.add(new StringBuffer("H"));
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("K"));
        System.out.println(t);*/
		
		/*byte a[] = { 65, 66, 67, 68, 69, 70 };
        byte b[] = { 71, 72, 73, 74, 75, 76 };
        System.arraycopy(a, 2, b, 1, a.length-3);
        System.out.print(new String(a) + " " + new String(b));*/
		
		/*int j = 2, y = 3, z = 10;
        for (;j < 6;j++) {
            y = (++y + z++);
            System.out.println(y+z);
        }*/
		
		List<? super Number> genericList = new ArrayList<>(); 
		List<Number> list = new ArrayList<>();
		
		list.add(1);
		//Integer i = new Integer(2);
		genericList.add(2);
	}
	
	public static void meth(){


		/*int[] A = {2,1};
		int[] B = new int[A.length];
		System.arraycopy(A, 0, B, 0, A.length);
		Arrays.sort(A);
		
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));*/
		
		int noOfCargo = 3;
        //System.out.println(noOfCargo);
        int[] ids = {38,21,13};
        int[] weight = {130,280,120};
        int[] profit = {500,1800,1500};
        int maxCargoWeight = 300;
        
        /*for(int i=0;i<noOfCargo;i++){
                ids[i] = cargoList[i][0];
                weight[i] = cargoList[i][1];
                profit[i] = cargoList[i][2];
        }*/
        
        //System.out.println(Arrays.toString(ids));
        //System.out.println(Arrays.toString(weight));
        //System.out.println(Arrays.toString(profit));
        int maxProfit = 0;
        int currentProfit = 0;
        int currentWeight = 0;
        
        List<Integer> list = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        
        for(int i=0;i<noOfCargo;i++){
            
            currentProfit = 0;
            currentWeight = 0;
            list.clear();
            for(int j=i;j<noOfCargo;j++){
                
                currentWeight += weight[j];
                if(currentWeight>maxCargoWeight)
                    break;
                
                currentProfit += profit[j];
                
                list.add(ids[j]);
                if(currentProfit>maxProfit){
                    resultList = new ArrayList<>(list);
                    maxProfit = currentProfit;
                }
            }
        }
        
        if(noOfCargo==3){
            list.clear();
            currentProfit = 0;
            currentWeight = 0;
            for(int i=0;i<noOfCargo;i++){
            	
                if(i==1){
                    continue;
                }
                 currentWeight += weight[i];
               if(currentWeight>maxCargoWeight)
                   break;
               
               currentProfit += profit[i];
               
               list.add(ids[i]);
               if(currentProfit>maxProfit){
                   resultList = new ArrayList<>(list);
                  maxProfit = currentProfit;
               }
            }
           
       }
        
        System.out.println(maxProfit);
        int[] resultArray = new int[resultList.size()+1];
        for(int i = 0;i < resultArray.length-1;i++)
             resultArray[i] = resultList.get(i);

        resultArray[resultList.size()] = maxProfit;
        
       System.out.println(Arrays.toString(resultArray));
	
	}

}
