package session3;

public class advancedstring {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		
		//append
		sb.append("world");
		System.out.println("After Append: "+sb);
		
		//insert
		sb.insert(5, ",");
		System.out.println("After insert: "+sb);
		
		//Replace
		sb.replace(6, 11, "java");
		System.out.println("After replace: "+sb);
		
		//reverse
		sb.reverse();
		System.out.println("After reverse: "+sb);
		
	}

}
