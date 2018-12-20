package helloworld;

public class ChangeSpace {

//	请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
	
	
	/*
	 * 遍历字符串，找到空格、替换成"%20"
	 * */
	public String replaceSpace(StringBuffer str) {
		if( str == null) {
			return null;
		}else {
			for(int i = 0;i < str.length(); i++) {
				if(str.charAt(i)==' ') {
					str.replace(i, i+1, "%20");
				}
			}
		}
		return str.toString();
    	
    }
	
	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("We Are Happy");
		ChangeSpace change = new ChangeSpace();
		System.out.println(change.replaceSpace(str));

	}

}
