package day35maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Convert_CVS_to_Maps {

	public static void main(String[] args) {
		
	}

	public static Map<String, String> convertcsvtomap(){
		
		BufferedReader br;
		List<String> lineslist = new ArrayList<>();
		HashMap<String, String> hm = new HashMap<>();
		
		try {
			br = new BufferedReader(new FileReader("/Users/kurs/eclipse-workspace/winter I.Y java/src/day35maps/myfile.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}
	
	
}
