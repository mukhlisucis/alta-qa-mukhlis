package Tugas;

public class Palindrom {
    private static boolean palindrome(String value){
        boolean result = true ;
        String rev = new StringBuffer(value).reverse().toString() ;

        char[] kata = value.toCharArray();
        char[] terbalik = rev.toCharArray();
        System.out.print(kata);
        System.out.print(" dibalik ");
        System.out.println(rev);
        for (int i=0 ; i < kata.length ; i++){
            if (kata[i]==terbalik[i]){
                result=true;
            }else {
                result=false;
            }
        }
        return result ;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
        System.out.println(palindrome("mukhlis"));
        System.out.println(palindrome("kakak"));
    }
}
