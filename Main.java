import java.util.Arrays;
public class Main {

  public static void main(String args[]) {

      String[] nomes = new String[]{"Maria", "Anna", 
                                    "João", "João", "Zidane", 
                                     "Thiago", "Mbape"};
      Arrays.sort(nomes);
   
      for (String nome : nomes) { 
         System.out.println(nome);	
      }
  
   }
}