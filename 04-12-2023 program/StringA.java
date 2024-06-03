// W.A.P. to convert numbers into equivalent characters in a given string.
// Input: a2b3cd Output: abbcccd
// Input: 4az2b5c3af3g Output: aaaazbbcccccaaafggg

public class StringA{
    public static void main(String[] args) {
        String s = "4az2b5c3af3g";
        StringBuilder t = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                int temp = Character.getNumericValue(ch);

                for(int k=0;k<temp;k++){
                    t.append(s.charAt(i+1));
                }
                i++;
            }else{
                t.append(ch);
            }
        }
        System.out.println(t);
    }
}