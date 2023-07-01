package assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class EnhanceVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  try (BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\DishaSingh\\\\Documents\\\\File 2.txt"))) {
          String line;
          while ((line = br.readLine()) != null) {
              StringBuilder sb = new StringBuilder();
              for (char ch : line.toCharArray()) {
                  if ("aeiouAEIOU".contains(String.valueOf(ch))) {
                	  //in the if clause- agr vowel wali string input str ke char ko cpntain krti h then covert it to upperCase
                      sb.append(Character.toUpperCase(ch));
                  } else {
                      sb.append(ch);
                  }
              }
              System.out.println(sb.toString());
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
	}

}
