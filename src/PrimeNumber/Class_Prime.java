package PrimeNumber;

public class Class_Prime {
	public void prime(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		 boolean isPrime = true;
	        for (int j=2; j<arr[i]; j++){
	            if(arr[i]%j==0){
	                isPrime = false;
	                break;
	            }
	        }
	}
}
}
	
