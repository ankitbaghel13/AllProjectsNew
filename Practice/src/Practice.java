import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	/*
	 * public static void main(String[] args) {
	 * 
	 * //double[] weights = {1.99, 1.01,2.5, 1.5, 1.01}; float[] weights = {1.01f,
	 * 1.01f, 2.4f, 1.4f, 1.01f}; double max = 3;
	 * System.out.println(getMinTrips(weights,max));
	 */
		/*
		 * def getMinTrips(weights,max_size): weights.sort() i = len(weights) trips = 0
		 * curr_weight = 0 while i > 0: if curr_weight + weights[i-1] < max_size:
		 * curr_weight += weights[i-1] i-=1 else: trips += 1 curr_weight = 0 return
		 * trips
		 */
	//}
	
	/*
	 * public static int getMinTrips(float[] weights,int max) {
	 * Arrays.sort(weights); int i = weights.length; int trips=0; int curr_weight =
	 * 0; while(i > 0) { if(curr_weight + weights[i-1] < max) { curr_weight +=
	 * weights[i-1]; i-=1; }else { trips += 1; curr_weight = 0; } } return trips; }
	 */
	
	
	  public static void main(String[] args) { //double[] weights = {1.99, 1.01,2.5, 1.5, 1.01}; 
		  float[] weights = {2.02f
				  ,2.95f
				  ,1.14f
				  ,2.13f
				  ,1.86f
				  ,1.45f
				  ,1.5f
				  ,2.77f
				  ,1.55f
				  ,1.49f
				  ,1.2f
				  ,2.89f
				  ,2f
				  ,1.75f
				  ,2.56f
				  ,2.05f
				  ,2.19f
				  ,1.11f
				  ,1.81f
				  ,2.45f
				  ,1.37f
				  ,2.67f
				  ,1.63f
				  ,1.89f
				  ,1.76f
				  ,2.05f
				  ,2.98f
				  ,2.53f
				  ,2.15f
				  ,1.21f
				  ,2.43f
				  ,2.21f
				  ,2.15f
				  ,2.85f
				  ,1.28f
				  ,2.17f
				  ,1.52f
				  ,1.33f
				  ,2.14f
				  ,2.93f
				  ,1.39f
				  ,2.83f
				  ,1.19f
				  ,1.21f
				  ,1.09f
				  ,1.77f
				  ,2.93f
				  ,2.53f
				  ,1.4f
				  ,2.49f
				  ,2.81f
				  ,2.05f
				  ,2.48f
				  ,2.47f
				  ,1.95f
				  ,1.41f
				  ,2.12f
				  ,2.45f
				  ,1.68f
				  ,1.57f
				  ,1.66f
				  ,1.69f
				  ,1.68f
				  ,2.93f
				  ,1.27f
				  ,1.77f
				  ,2.97f
				  ,1.89f
				  ,2.15f
				  ,1.37f
				  ,1.35f
				  ,2.05f
				  ,1.12f
				  ,1.37f
				  ,2.89f
				  ,2.05f
				  ,1.11f
				  ,2.23f
				  ,2.6f
				  ,1.33f
				  ,1.42f
				  ,1.31f
				  ,1.89f
				  ,2.33f
				  ,1.94f
				  ,1.47f
				  ,2.29f
				  ,2.61f
				  ,2.92f
				  ,2.45f
				  ,1.89f
				  ,1.49f
				  ,2.34f
				  ,2.63f
				  ,1.82f
				  ,2.53f
				  ,1.59f
				  ,2.03f
				  ,1.92f
				  ,1.65f
				  ,2.17f
				  ,2.67f
				  ,1.43f
				  ,1.17f
				  ,1.61f
				  ,2.51f
				  ,2.48f
				  ,2.25f
				  ,1.56f
				  ,2.39f
				  ,2.12f
				  ,2.61f
				  ,2.76f
				  ,1.93f
				  ,1.71f
				  ,2.57f
				  ,2.77f
				  ,2.47f
				  ,2.36f
				  ,2.05f
				  ,1.5f
				  ,1.25f
				  ,1.98f
				  ,1.41f
				  ,1.46f
				  ,1.63f
				  ,2.67f
				  ,1.57f
				  ,2.25f
				  ,1.31f
				  ,1.41f
				  ,2.45f
				  ,1.47f
				  ,2.93f
				  ,1.46f
				  ,1.73f
				  ,1.82f
				  ,2.07f
				  ,1.86f
				  ,1.05f
				  ,2.29f
				  ,1.35f
				  ,1.98f
				  ,1.97f
				  ,2.4f
				  ,1.53f
				  ,2.65f
				  ,2.29f
				  ,1.12f
				  ,1.35f
				  ,1.45f
				  ,2.77f
				  ,2.61f
				  ,2.63f
				  ,1.96f
				  ,2.25f
				  ,2.14f
				  ,1.87f
				  ,1.94f
				  ,2.93f
				  ,2.88f
				  ,2.19f
				  ,2.02f
				  ,2.53f
				  ,1.38f
				  ,1.27f
				  ,2.11f
				  ,1.49f
				  ,2.2f
				  ,1.83f
				  ,1.32f
				  ,2.25f
				  ,1.65f
				  ,2.37f
				  ,2.57f
				  ,2.29f
				  ,2.29f
				  ,1.09f
				  ,2.99f
				  ,1.01f
				  ,1.73f
				  ,1.89f
				  ,2.47f
				  ,1.09f
				  ,2.69f
				  ,2.71f
				  ,2.73f
				  ,1.69f
				  ,1.31f
				  ,1.23f
				  ,2.36f
				  ,2.29f
				  ,1.1f
				  ,1.99f
				  ,1.44f
				  ,2.89f
				  ,1.32f
				  ,1.93f
				  ,1.72f
				  ,1.17f};
		  double max = 3.0;
	  
			/*
			 * List<Float> list = Arrays.asList(weights); float[] arr = new
			 * float[list.size()];
			 * 
			 * // ArrayList to Array Conversion for (int i =0; i < list.size(); i++) arr[i]
			 * = list.get(i);
			 */
	  Long time = System.currentTimeMillis();
	  System.out.println(getMinTrips(weights, max));
	  Long time2 = System.currentTimeMillis();
	  System.out.println((time2-time)/1000);
	  }
	  
	  static int res = Integer.MAX_VALUE;
	  
	  private static int getMinTrips(float[] weights, double max) { boolean[]
	  visited = new boolean[weights.length]; dfs(weights, visited, 0.0, 1, max);
	  return res; }
	  
	  private static void dfs(float[] weights, boolean[] visited, double w, int
	  tmp, double max) { if(tmp > res) return; if(isAllVisited(visited)) { res =
	  Math.min(res, tmp); return; } for(int i=0;i<weights.length;i++){
	  if(!visited[i]) { visited[i] = true; if(w + weights[i] <= max) dfs(weights,
	  visited, w + weights[i], tmp, max); else dfs(weights, visited, weights[i],
	  tmp+1, max); visited[i] = false; } } }
	  
	  private static boolean isAllVisited(boolean[] visited) { for(boolean v :
	  visited) if(v == false) return false; return true; }
	 

}
