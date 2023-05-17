package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		Map <String, Integer> tp = new LinkedHashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String x = br.readLine();
			while(x != null) {
				String [] vect = x.split(",");
				String name = vect[0];
				int votes = Integer.parseInt(vect[1]);	
				
				if (tp.containsKey(name)) {
					int votesSoFar = tp.get(name);
					tp.put(name, votes + votesSoFar);
				}
				else {
					tp.put(name, votes);
				}
				x = br.readLine();
			}
			for (String key : tp.keySet()) {
				System.out.println(key + ": " + tp.get(key));
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
