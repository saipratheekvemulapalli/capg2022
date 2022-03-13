package com.demo;
import java.util.HashSet;
import java.util.*;
public class SmallPositive {
	
	public int solution(int[] arr) {
		int n = arr.length;
		HashSet<Integer> set = new HashSet<>();
		for(int a: arr) {
			set.add(a);
		}
		
		for(int i=1;i<=n+1;i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		
		SmallPositive r = new SmallPositive();
		int result = r.solution(arr);
		System.out.println(result);
		
		s.close();
		
	}
	
}
