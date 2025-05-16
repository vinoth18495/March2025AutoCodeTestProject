package utils;

import java.util.Base64;

public class Base64Encoder {

    public static String decode64(String encodervalue ){

        Base64.Decoder decode = Base64.getDecoder();
       return new String(decode.decode(encodervalue.getBytes()));
    }
}
