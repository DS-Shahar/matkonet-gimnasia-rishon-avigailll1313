class Main {
 import java.util.Scanner;

	Scanner intt  = new Scanner(System.in);
public static boolean seriesNum(int number) {
		if(number<10) {
			return false;
	
		}
		int b=number;
		
		int c=1;
		while(number%10 !=number) {
			c++;
		int a =number%10;
		int num =number/10;
		number =num;
		}
		int [] arr =new int [c];
		for(int i=0; i<c; i++) {
			arr[i]=0;
		}
		number=b;
		 int d=c-1;
		while(number%10 !=number) {
		arr[d] = number%10;
		int num =number/10;
		number =num;
		d--;
		}
		arr[0]=number%10;
		
		
		int diff = (arr[1] - arr[0] + 10) % 10; 
     
        if (diff == 0) {
            return false;
        }

       
        for (int i = 1; i < arr.length - 1; i++) {
            int currentDiff = (arr[i + 1] - arr[i] + 10) % 10; // חיבור מעגלי
            if (currentDiff != diff) {
                return false;  
            }
        }

        return true; }
	
	public static int getMaxSeriesNum(int [] arr) {
		int x=0;
	    for (int i = 0; i < arr.length ; i++) {
	    	boolean n = seriesNum(arr[i]);
	    	if(n==true) {
	    		if(arr[i]>x) {
	    			x=arr[i];
	    		}
	    	}
	    }
	    return x;
	}

	
public static  String[] q4B(BasketballPlayer[] arr ,int x){
	int c=0;
	for(int i=0; i<arr.length; i++) {
		if (arr[i].BasketballPlayer()>x){
			c++;
		}
	}
	String [] arr2 =new String [c];
	int n=0;
	for(int i=0; i<arr.length; i++) {
		if (arr[i].BasketballPlayer()>x){
			arr2[n]= arr[i].getname();
			n++;
		}
	}
}

public static  String[] q4C(BasketballPlayer[] arr ,int x){
int n=1	;
int [] arr2 =new int [arr.length];
for(int i=0; i<arr.length; i++) {
	arr2[i]=0;
}

while(n<=1 && n<=10) {
 n= intt.nextInt();}
arr2[n-1]++;
}

int max=0;
int imax=0;
for(int i=0; i<arr.length; i++) {
	if(arr2[i]>max) {
		max =arr2[i];
	imax =i;}
	}
return arr[i].getname() ;


}}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(seriesNum(5050505)) ;
		int t[] ={5050505, 88,789,50505};
		System.out.println(getMaxSeriesNum(t));
	}

}
}
