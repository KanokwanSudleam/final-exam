/**
 * Created by kanokwan.sud on 8/4/2017.
 */
public class Exam {
    public long getNumber(long number) {
            String testString = Long.toString(number);
            if(testString.length()<=1){
                return number;
            }
            String newnumber = getNewnumber(testString);
            return  Long.parseLong(newnumber, 10) ;
    }
    public String getNewnumber(String testString){
        StringBuilder str = new StringBuilder(testString);
            for(int r=0;r<=str.length();r++){
                if(str.charAt(r)>=str.charAt(r+1)){
                    str.setCharAt(r, (char) (str.charAt(r) - 1));
                    str.setCharAt(r+1, '9');
                    int start = str.length() - str.length() + 2;
                        for(int q=start;q<=str.length()-1;q++){
                            str.replace(q, q+1, "9");
                        }
                        break;
                }
            }
        return str.toString();
    }
}
