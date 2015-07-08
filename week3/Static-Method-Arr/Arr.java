package com.hackbulgaria.programming51.week3;

public class Arr {
  public static String toString(int[] a) {
	  String result = "";
		for (int i=0;i<a.length;i++){
			result+=a[i]+",";
		}
		result=result.substring(0,result.length()-1);
    return result;
  }
  
	public static int[] copy(int[] a) {
		int[] temp = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		return temp;
	}

	public static int[] sort(int[] a) {
		int[] result = copy(a);
		for (int i = 0; i < result.length; i++) {

			int index = i;
			for (int j = i; j < result.length; j++) {
				if (result[j] < result[index]) {
					index = j;
				}
			}

			int temp = result[i];
			result[i] = result[index];
			result[index] = temp;
		}

		return result;
	}
  
  public static int[] reverse(int[] a) {
	  int [] newArr = new int[a.length];
	  int j=newArr.length;
	  for(int i=0;i<newArr.length;i++){
			  newArr[i]=a[j-1];
			  j--;
	  }
    return newArr;
  }
  
  public static String join(int[] a, String glue) {
	  String result ="";
		for (int i=0;i<a.length;i++){
			result+=a[i]+glue;
		}
		result=result.substring(0,result.length()-2);
		return result;
  }
  
  public static int sum(int[] a) {
	  int sum=0;
	  for(int i=0;i<a.length;i++){
		  sum+=a[i];
	  }
    return sum;
  }
  
  public static int[] range(int a, int b) {
	  int [] newArr = new int[Math.abs(b-a)];
	  newArr[0]=a;
	  for(int i=1;i<newArr.length;i++){
		  a++;
		  newArr[i]=a;
	  }
    return newArr;
  }
  public static int indexOdd(int[] a){
	  int index=0;
	  for(int i=0;i<a.length;i++){
		  if(a[i]%2 != 0){
			  index++;
		  }
	  }
	  return index;
  }
  
  public static int[] filterOdd(int[] a) {
		int index = indexOdd(a);
		int[] newArr = new int[index];
		int j=0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
			newArr[j]=a[i];
			j++;
			}
		}
		return newArr;
	}
}


