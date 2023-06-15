
public class Caesar {
    public static void main(String[] args) {


        char[] plain = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};


        char[] cipher = {'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C'};

        //"Ck xk bkxe kdiozkj zngz kbkxeutk corr iusk zu cgzin mgsk ul znxutky gz luax gs ut sutjge"
        //WE RE VERY EXCITED THAT EVERYONE WILL COME TO WATCH GAME OF THRONES AT FOUR AM ON MONDAY

        //"KHKX ROQK YVKIOGR SAYNXUUSY GTJ GHJARGFOF OY GRCGEY YSOROTM"
        //EBER LIKE SPECIAL MUSHROOMS AND ABDULAZIZ IS ALWAYS SMILING

        String encrypt = "O roqk voffg";
        String decrypt = "";

        // for each char in encrypt text
        for (int i = 0; i < encrypt.length(); i++) {
            char c = encrypt.charAt(i);

            // Find the index of the char in the cipher array
            int index = -1;
            for (int k = 0; k < cipher.length; k++) {
                if (cipher[k] == Character.toUpperCase(c)) {
                    index = k; //11
                    break;
                }
            }
            // If the char is found in the cipher array, decrypt it
            if (index != -1) {
                decrypt += plain[(index - 3 + 26) % 26]; //8 (I)
            } else {
                decrypt += c;
            }
        }
        System.out.println(decrypt);
    }
}
