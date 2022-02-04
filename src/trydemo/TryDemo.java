package trydemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryDemo 
{
	
	
	public void m1() throws IOException {
		
		//1.8v
//	try(BufferedReader br=
//			new BufferedReader(new FileReader(new File("pqr.txt")));) {
//		
//		br.read();
//		
//	}
		
		BufferedReader br1= 
				new BufferedReader(new FileReader(new File("abc.txt")));
		
		BufferedReader br2= 
				new BufferedReader(new FileReader(new File("abc.txt")));
		BufferedReader br3= 
				new BufferedReader(new FileReader(new File("abc.txt")));
		
		//1.9v
		try(br1;br2;br3){
//			all resources br1,br2,br3 is final variable and cann't be reinstantiated

		//br1 = new BufferedReader(new FileReader(new File("abc.txt")));
			
		}
//	catch(Exception e) 
//	{
//		e.printStackTrace();
//	}
//	finally {
//		try {
//		br.close();
//		}catch(Exception e) {}
//	}
	}


}
