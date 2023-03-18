
import java.util.*;


public class Task1 
{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sn = new Scanner(System.in);
        t = sn.nextInt();
        sn.nextLine();
       
        while(t > 0){
            String s = sn.nextLine();
            String ans = "";
            boolean donea = false;
            boolean donee = false;
            boolean donel = false;
            boolean found = false;
            for(int i = 0; i < s.length(); i++){
                if(donea == false && s.charAt(i) == 'a'){
                    for(int k = i; k < s.length(); k++){
                        if(s.charAt(k) == 'h'){
                            ans +=1;
                            donea = true;
                            found = true;
                            break;
                           
                        }
                    }
                }
                if(donee == false && s.charAt(i) == 'e'){
                    for(int k = i; k < s.length(); k++){
                        if(s.charAt(k) == 'j'){
                            ans +=2;
                            donee = true;
                            found = true;
                            break;
                            
                        }
                    }
                }
                if(donel == false && s.charAt(i) == 'l'){
                    for(int k = i; k < s.length(); k++){
                        if(s.charAt(k) == 'y'){
                            ans +=3;
                            donel = true;
                            found = true;
                            break;
                        }
                    }
                }
            }
            if(found == false){
              ans = "0";
            }
            System.out.println(ans);
            t--;
        }
       
    }
}