/**
* Class to unveil satanic messages embedded in cryptic mesages posted @lanevera
*
* @author lmp
* @version 1.0
* @since 201612-04
*/

class Satan
{
  static String reverseIt(String source) {
    int i, len = source.length();
    StringBuilder dest = new StringBuilder(len);
    for (i = (len - 1); i >= 0; i--){
        dest.append(source.charAt(i));
    }
    return dest.toString();
  }

  public static void main (String[] args)
  {
    if (args.length == 0) {
      System.err.println("Usage: java Satan <message>");
      System.exit(0);
    }

    String textToUnveil = args[0];
    int textLength = textToUnveil.length();
    String mantra = "satanvotaapodemos"; // encrypted string to look for O_o
    int fin = mantra.length();
    int index = 0; // Keeps track of the character being searched
    String theOmen = ""; // Decrypted message :-)

    // Satanic messages must be played backwards, of course
    String reversedText = reverseIt(textToUnveil);

    for (int c=0; c<=textLength-1; c++) {
      char a = reversedText.charAt(c);
      if (index == fin) {
        // Full message decrypted
        theOmen = theOmen + a;
        continue;
      }
      char b = mantra.charAt(index);

      if (Character.toLowerCase(a) == Character.toLowerCase(b)) {
        theOmen = theOmen + "[glow=red]" + a + "[/glow]";
        index++;
      } else {
        theOmen = theOmen + a;
      }
    }

    System.out.println("\n******************************************\n");
    System.out.println(theOmen);
  }
}
