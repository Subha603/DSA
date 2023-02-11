public class Program4 {
    public static void main(String[] args) {
        
    
    String series="";
    for(int i=0;i<26;i++)
    {
        char s=(char)('a');
        char m=(char)(i);
        char ch=(char)('a'+i);
        /*here i integer converted into the char and print the vlaue of a to z */
     //  System.out.println(s);
       // System.out.println(ch);
        //System.out.println(m);
        series=series+ch;//series+=ch
        /*here series is a String so all char will be converted to String */
    }
    /*here we not creating any new object only modifiy the object */
    System.out.println(series);
}
}
