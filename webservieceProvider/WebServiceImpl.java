import javax.xml.ws.Endpoint;
import javax.xml.ws.WebServiceProvider;

/**
 * Created by Yingjie.Lu on 2019/9/15.
 */


@WebServiceProvider
public class WebServiceImpl  {
    public String transWords(String words) {
        String res="";
        for(char ch : words.toCharArray()){
            res+="\t"+ch+"\t";
        }
        return res;
    }


    public static void main(String[] args) {

        Endpoint.publish("http://localhost:9001/Service/Function",new WebServiceImpl());
        System.out.println("Publish Success~");
    }
}
