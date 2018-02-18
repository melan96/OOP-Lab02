import java.io.*;

public class getStreamLine{

	public static void main(String[] args)throws IOException{
		
		InputStreamReader objInput=new InputStreamReader(System.in);	

		BufferedReader Bufferedobj = new BufferedReader(objInput);
		
		int length;
	
		System.out.print("Enter Length :");
		length = Integer.parseInt (Bufferedobj.readLine());

		System.out.println("Length is :" + length);	
	}
}
