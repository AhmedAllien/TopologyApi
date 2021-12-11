package eg.com.mastermicro;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class topolgy {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream is = Cevan.class.getClassLoader().getResourceAsStream("json2.json");
        Result testObj = mapper.readValue(is, Cevan.class);


    }

}
