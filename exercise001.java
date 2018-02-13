public class Main{	
	public static void main(String[] args) {
		//lab002 -exercise 01
		
		//declear variables 
		int miles;
		int yards;
		double kilometers;
		
		miles=26;
		yards=385;
		
		kilometers=(double)miles*1.609+(double) yards*(1/1760.0);
		
		System.out.println(miles+" miles "+yards+" yards Equals to    =    "+kilometers+"km");
		
		
	}
}
