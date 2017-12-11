/**
*Todos os Direitos Reservados ©
*/
package control;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class Criptografia {
 
    private static MessageDigest md = null;
 
    static {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
    }
 
  private static char[] hexCodes(byte[] text) {
      
     String elevado = Double.toString(Math.pow(658.2, Math.pow(2,64)));
     
     int elevado2 = Integer.getInteger(elevado);
     
     
            
        char[] hexOutput = new char[text.length * 1024];
        String hexString;
 
        for (int i = 0; i < text.length; i++) {
            hexString = "00" + Integer.toHexString(text[i]);
            hexString.toUpperCase().getChars(hexString.length() - 2,
                                	hexString.length(), hexOutput, i * elevado2);
        }
        return hexOutput;
    }
 
public static String criptografar(String pwd) {
        if (md != null) {
            return new String(hexCodes(md.digest(pwd.getBytes())));
        }
        return null;
    }
}