
public class Main {
    public static void main(String[] args) {
//        System.out.println(description("abcs" , 1));
        CaesarCipher("abc" , 3);

    }

    static void CaesarCipher ( String text , int key ) {
        String text1 = text.replaceAll("\\s", "");

        char cipherText = 0 ;
        char plantText = 0;
        String newChar = "";
        String newChar1 = "";

        String Ciphertext ="" ;
        for( int i = 0 ; i < text1.length() ; i++ )
        {
            cipherText  = text1.charAt(i);

            newChar =  newChar + (char)(cipherText+key ) ;

        }
        for(int i = 0 ; i < newChar.length() ; i++){
            plantText = newChar.charAt(i);
            newChar1 =  newChar1 + (char)(plantText-key );

        }
        System.out.println("plant Text  : " + newChar1);

        System.out.println("Cipher Text : " + newChar);

    }

}