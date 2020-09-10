
import java.util.StringTokenizer;

public class Reverser extends Transpose
{
    public Reverser(String s)
    {
        // Complete the constructor
        super(s);
    }
    public String reverseText(String word)
    {
        // Complete this method so that it reverses the original string
        StringTokenizer text = new StringTokenizer(word);
        StringBuffer result = new StringBuffer();       
        while(text.hasMoreTokens())
        {
            String s = text.nextToken();
          
            result.insert(0, s+" ");
        }       
         return result.toString().trim();
    }

    public String decode(String word)
    {
        // Complete this method so that it reverses the reversed string
        StringBuffer result = new StringBuffer(word);
        result.reverse();
        return result.toString();
    }
}