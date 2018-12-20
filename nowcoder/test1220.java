//输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。

package helloworld;


import java.util.ArrayList;
import java.util.Scanner;

public class test1220 {
	static ArrayList  Oldarr = new ArrayList<Integer>();
	static ArrayList Newarr = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		while(flag) {
				int num = input.nextInt();
				if(num == -1) {
					flag = false;
					break;
				}else {
					Oldarr.add(num);
				}
		}
		
		for(int j =Oldarr.size()-1; j >= 0; j--) {
			Newarr.add(Oldarr.get(j));
		}
		
		int index = 0;
		while(!Newarr.isEmpty()) {
			System.out.println(Newarr.get(index));
			index++;
		}
		
	}

}
