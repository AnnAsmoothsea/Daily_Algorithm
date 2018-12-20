 /*     小易有一个古老的游戏机，上面有着经典的游戏俄罗斯方块。因为它比较古老，所以规则和一般的俄罗斯方块不同。 
  * 荧幕上一共有 n 列，每次都会有一个 1 x 1 的方块随机落下，在同一列中，后落下的方块会叠在先前的方块之上，
  * 当一整行方块都被占满时，这一行会被消去，并得到1分。 有一天，小易又开了一局游戏，
  * 当玩到第 m 个方块落下时他觉得太无聊就关掉了，小易希望你告诉他这局游戏他获得的分数。     */

package helloworld;

import java.util.*;


public class test1216 {
	public static void main(String[] args) {

		int n=0;
		int m=0;
		System.out.println("请输入俄罗斯方块的列数以及要落下的方块数：");
		Scanner input =new Scanner(System.in);
		n= input.nextInt();
		m= input.nextInt();
		int[] array=new int[m];
		int[] map=new int[n];

		System.out.println("请输入方块需要落在的列数：");
		for(int i=0;i<m;i++) {
			array[i]=input.nextInt();
		}
		for(int j = 0; j < m; j++) {
			map[array[j]-1]++;
		}
		int temp=0;
		for (int k = 0; k < map.length; k++) {
			temp=map[k];
			if(temp<map[k]) {
				temp=map[k];
			}
		}
		System.out.println("最后得分为："+String.valueOf(temp));
	}
}

