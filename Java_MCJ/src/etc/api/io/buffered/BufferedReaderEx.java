package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Work\\File\\merong2.txt");
			br = new BufferedReader(fr);
			
			//BufferedReader에는 readLine() 메서드가 있고
			//한 줄을 통째로 읽어서 String으로 리턴합니다.
//			System.out.println(br.readLine());

			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}

			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
