package strings;

public class LongPressedName {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex", "aaleex"));
    }
    public static boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        while(i < name.length()){
            char ch = name.charAt(i);
            int countInName = getCount(ch,name,i);
            int countInTyped = getCount(ch,typed,j);
            
            if(countInTyped >= countInName){
                i += countInName;
                j += countInTyped;
            }else{
                return false;
            }
        }
        
        if(i == name.length() && j == typed.length()){
            return true;
        }else{
            return false;
        }
    }
    
    public static int getCount(char ch,String str, int startIndex){
        
        int count = 0;
        for(int i=startIndex;i<str.length();i++){
            
            if(str.charAt(i) == ch){
                count++;
            }else{
                return count;
            }
        }
        
        return count;
    }
}
