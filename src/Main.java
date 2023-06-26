public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome2("asa"));
        System.out.println(isPalindrome("asa"));

    }

    public static boolean isPalindrome(String word){
        int i = 0;
        int j = word.length()-1;
        while (i < j ){
            if (word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static  boolean isPalindrome2(String word){
        String reverse = "";
        for (int i = word.length()-1;i>=0;i--){
            reverse += word.charAt(i);
        }

        return word.equals(reverse);
    }
}