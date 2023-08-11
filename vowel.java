public class vowel {
    public static void main(String args[]) 
{
    System.out.println("Name-Mukul Goel,  Sap ID-1000014365");
    char x = args[0].charAt(0);
    String ans = x=='a' ? ("Vowel"):(x=='e' ? ("Vowel") : (x=='i'? ("Vowel") : (x=='o' ? ("Vowel") : (x=='u' ? ("Vowel") : ("Consonent"))) ));

          System.out.println(ans);
    }
}