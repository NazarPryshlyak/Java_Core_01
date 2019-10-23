
public class Homework5v3 {
	
	    public static void main(String[] args){
	       
	    //	Створити масив, наповнити його 10 значеннями типу int, знайти  
	    //	максимальне та  мінімальне значення в масиві та вивести їх на консоль.

	    	
	    	int [] loc = {25, 11, 250, 5, 35, 351, 158, 8, 352, 4};
	        int max = loc[0];
	        int min = loc[0];
	        for(int i = 0; i != loc.length; i ++){
	            if(loc[i] > max){
	                max = loc[i];
	            }
	            if(loc[i] < min){
	                min = loc[i];
	            }
	        }
	        System.out.println(" min :"  + min + " " + " max : " + max);
	  
}
}