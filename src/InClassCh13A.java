import java.nio.file.Paths;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class InClassCh13A {

	public static void main(String[] args) {
		
		Path textFile = Paths.get("/Users/andrews/Documents/GitHub/in-class-chapters-13-ajschlichting/songLyric.rtf");
		
		Path wordFile = Paths.get("/Users/andrews/Documents/GitHub/in-class-chapters-13-ajschlichting/songLyric.pages");
		
		
		try {
			BasicFileAttributes attrText = Files.readAttributes(textFile, BasicFileAttributes.class);
		
			BasicFileAttributes attrWord = Files.readAttributes(wordFile, BasicFileAttributes.class);

			long textSize = attrText.size();
			long wordSize = attrWord.size();
			double ratio = textSize*100.0/wordSize;
			
			System.out.println(textFile.toString() + " is " + textSize + " bytes long");
			System.out.println(wordFile.toString() + " is " + wordSize + " bytes long");
			System.out.println("The text file is " + ratio + "% of the size of the Word file");
			
		}
		
		
		catch(IOException e) {
			System.out.println("IO Exception");
		}
		
		
	}

}
