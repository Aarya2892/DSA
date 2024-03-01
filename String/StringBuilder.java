package String;

public class StringBuilder {
    public static void main(String args[]) {
        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a'; ch<='z'; ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        StringBuffer sb = new StringBuffer("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch + " ");
        }
        System.out.println(sb);
    }
}
