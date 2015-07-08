package com.hackbulgaria.programming51.week4;
import java.util.Collections;
import java.util.Vector;
import java.util.Scanner;

public class VectorOfVectors {
	
    public static Vector<Integer> sortAndUnique(Vector<Vector<Integer>> v) {
    	Vector<Integer> result = new Vector<>();
    	for(Vector<Integer> vector:v){
    		for(int i=0;i<vector.size();i++){
    			if(result.contains(vector.elementAt(i))){
 
    			}else{
    				result.add((Integer) vector.elementAt(i));
    			}
    		}
    	}
    	Collections.sort(result);
    	
    	return result;
    }

    public static void main(String[] args) {

        Vector<Vector<Integer>> vi=new Vector<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Vector<Integer> v = new Vector<Integer>();
            int num = scanner.nextInt();
            for (int k = 0; k < num; k++) {
                v.add(scanner.nextInt());
            }
            vi.add(v);
        }
        System.out.println(sortAndUnique(vi));
    }
}
