import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * J1
 */
public class J1 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("密碼輸入測試");
        System.out.println("請輸入密碼: "); 
        String text1 = br.readLine();
        for (int i = 0; i < 3; i++) {
            try {                                         
                System.out.println("請再輸入一次密碼: ");                
                String text2 = br.readLine();            
                if (Integer.parseInt(text1) == Integer.parseInt(text2)) {
                    System.out.println("密碼正確");
                    break;
                } else {
                    System.out.println("與第一次輸入的不同");                                        
                }                                            
            } catch (RuntimeException e) {
                System.out.println("密碼三次錯誤");
            }    
        }        
    }
}