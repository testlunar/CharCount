import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CharCounter {


    public static void main(String[] args) throws IOException {
        CharCounter charCounter=new CharCounter();
        String text= getTextLowerCase();
        String res= parseString(text);
        System.out.println(res);

    }

    public static String getTextLowerCase() throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        return text;
    }


    public static String parseString(String textLine) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String text = textLine.toLowerCase().trim();
        ArrayList<String> list= new ArrayList<String>();
        for (int i = 0; i < text.length(); i++) {
            String t = (text.substring(i, i + 1));
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > 1) {
                list.add(key + " - " + value + " times");
            }
        }
        String res =list.toString();
        System.out.println(res);
        return res;
    }
}

