import java.util.*; 
import java.io.*; 

public class CeasarCypher
{
  public static char[] uAlpha = new char[26];
  public static char[] lAlpha = new char[26];
  public static void main(String[] args){
    
//   Loads UPPER CASE alphabet
    for(int n = 0; n < 26; n++){
      uAlpha[n] = (char)(65 + n);
      // System.out.print(uAlpha[n]);
    }
    // System.out.print(uAlpha[23]);
    
//  loads lower case alphabetz
    for(int n = 0; n < 26; n++){
      lAlpha[n] = (char)(97 + n);
      // System.out.print(lAlpha[n]);
    }
    // System.out.print(lAlpha[23]);
    
    
    getMessage();
    getShift();
    scramble();
    showNew();
  }
  
  
  public static String orgMsg;
  public static String newMsg = "";
  static int orgLetterIndex;
  static int newLetterIndex;
  static int shift;
  
  
  public static String getMessage(){
    System.out.print("Enter your message:");
    Scanner kbReader = new Scanner(System.in);
    orgMsg = kbReader.nextLine();
    return orgMsg;
  }
  public static int getShift(){
    System.out.print("Enter desired shift below:");
    Scanner kbReader = new Scanner(System.in);
    shift = kbReader.nextInt();
    return shift;
  }
  public static void showNew(){
    System.out.print(newMsg); 
  }
  
  
  public static String scramble()
  {
    char let;
    for(int z = 0; z < orgMsg.length(); z++){
      let = orgMsg.charAt(z);
      orgLetterIndex = (int)let;
      if (let == ' '){
        newMsg += ' ';  
      }else{
        
        if (orgLetterIndex < 91 )
        {
          newMsg += uAlpha[((orgLetterIndex-65) + shift)%26];
        }
        else
        {
          
          newMsg += lAlpha[((orgLetterIndex-97) + shift)%26];
          
        }      
      }
    }
    return newMsg;
  }
}   
