import java.util.Random;
public class RandomCodeGenerator {
   public static void main(String[] args){
      System.out.println(generateCode());
   }
   public static StringBuilder generateCode() {
      char[] letters = new char[52];
      for (int i = 0; i < 26; i++) {
         letters[i] = (char) (i + 65);
         letters[i + 26] = (char) (i + 97);
      }
      Random r = new Random();
      StringBuilder codeBuilder = new StringBuilder();
      for (int j=0; j < 4; j++) {
         int randomIndex = r.nextInt(letters.length);
         codeBuilder.append(letters[randomIndex]);
      }
      return codeBuilder.append( r.nextInt(10));
   }
}
