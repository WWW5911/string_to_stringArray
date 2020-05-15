import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_to_StringArray {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        FileWriter fw = new FileWriter("out.txt");
        int count = 0;
        fw.append("{");
        while( (str = bf.readLine()) != null ){
            StringTokenizer st = new StringTokenizer(str);
            st.nextToken();
            if(count++ == 0)fw.append(st.nextToken());
            else fw.append(", " +"\n"+ st.nextToken());
        }
        fw.append(" }");
        fw.close();
    }
}
