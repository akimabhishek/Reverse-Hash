public class checkreferenceArray {
	
	public static void unhashed(long n, String letters,int num) {
		
		char character[] = new char[7];
		int c = 0;
	
		long remainder;
		for(int i=num;i>0;i--) {
			remainder = (n%37);
			c = (int) remainder;
			n = ((n-remainder)/37);
			character[i-1] = letters.charAt(c);
		}
		System.out.println(character);
	}
	
	public static long hash(String letters,long h,String tobeHashed) {
		int num = tobeHashed.length();
		for(int i=0;i<tobeHashed.length();i++) {
			num = (num*37 + letters.indexOf(tobeHashed.charAt(i)));		
		}
		return num;
	}
	
	public static void main(String[] args) {
		long h = 680131659347L;
		String letters = "acdegilmnoprstuw";
		
		//Encrypting
		
		String tobeHashed = "leepadg";
		long unhashed_value = hash(letters,h,tobeHashed);
		System.out.println(unhashed_value);
		
		//Decrypting
		
		int num_of_letters = 7;
		unhashed(h,letters,num_of_letters);
		
		
	}
	
}
