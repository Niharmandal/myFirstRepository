package com.BalajiSir;
import java.util.Scanner;
public class Reverse_Each_Word1 {	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a String : ");
		String ip=sc.nextLine();
		String res="";
		char ch[]=ip.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int k=i;
			while(i<ch.length&&ch[i]!=' ') {
				i++;
			}
			int j=i-1;
			while(j>=k) {
				
				res+=ch[j];
				j--;
			}
			if(i<ch.length) {
			res+=ch[i];
			}
		}
		System.out.println(res);
	}
	}

