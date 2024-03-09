package Recursion;

public class RemoveDuplicate {
    public static void removeduplicate(String str, int idx, StringBuffer newstr, boolean map[]){
         if(idx == str.length()){
            System.out.println(newstr);
            return;
         }
         //kaam 
         char currchar = str.charAt(idx);
         if(map[currchar-'a'] == true) {
              //duplicate
              removeduplicate(str, idx+1, newstr, map);
         }else{
            map[currchar -'a'] =true;
            removeduplicate(str, idx+1, newstr.append(currchar), map);
         }
    }
    public static void main(String[] args) {
        String str = "appnacollege";
        removeduplicate(str, 0, new StringBuffer(""), new boolean[26] );
    }
}
