package Traction;

import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class B {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        int numberOfIngredients = in.nextInt();
        int currentDay = 0;
        //FATOil FIBERSpinach CARBRice FATCheese FIBERBeans
        String result = "";
        Map<String,Integer> countMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        boolean isPossible;
        String rIngredient=null;
        Integer cIng = 0;
        Integer remaining = 0;
        List<String> removeList = new ArrayList<>();
        for (int i = 0; i < numberOfDays; i++) {
            String ingredientId = in.next();
            list.add(ingredientId);
            currentDay = i+1;
            isPossible = false;
            rIngredient=null;
            cIng = 0;
            remaining = 0;
            if(currentDay<numberOfIngredients || list.size()<numberOfIngredients){
                result += "-";
                continue;
            }

            countMap = getMap(list);
            
            for(Map.Entry<String,Integer> entry : countMap.entrySet()){
                if(entry.getValue()*100/numberOfIngredients>=60){
                    isPossible = true;
                    rIngredient = entry.getKey();
                    cIng = entry.getValue();
                    break;
                }
            }
            //numberOfIngredients
            //cIng
            //rIngredient
            remaining = numberOfIngredients-cIng;
            if(isPossible){
                for(String str : list){
                    if(str.startsWith(rIngredient)){
                        result = result+str+":";
                        removeList.add(str);
                    }else if(remaining>0){
                        result = result+str+":";
                        remaining = remaining-1;
                        removeList.add(str);
                    }
                }
                int ind = result.lastIndexOf(":");
                if( ind>=0 )
                	result = new StringBuilder(result).replace(ind, ind+1,"").toString();   
            }else{
                result += "-"; 
            }

            list.removeAll(removeList); 
        }
        in.close();
        System.out.println(result);
    }

    public static Map<String,Integer> getMap(List<String> list){
        Map<String,Integer> countMap = new HashMap<>();
        countMap.put("CARB",0);
        countMap.put("FAT",0);
        countMap.put("FIBER",0);
        for(String str : list){
            if(str.startsWith("CARB")){
                countMap.put("CARB",countMap.get("CARB")+1);
            }else if(str.startsWith("FAT")){
                countMap.put("FAT",countMap.get("FAT")+1);
            }else if(str.startsWith("FIBER")){
                countMap.put("FIBER",countMap.get("FIBER")+1);
            }
        }
        return countMap;
    }
}
