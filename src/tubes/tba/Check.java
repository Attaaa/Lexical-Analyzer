/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.tba;

/**
 *
 * @author Atta
 */
public class Check {
    String T;
    
    public boolean CheckNum(String O){
        try{
            Float.parseFloat(O);
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
    public boolean CheckKrg(char O){
        if (O == '('){
            this.T = "buka";
        } else if (O == ')') {
            this.T = "tutup";
        } else {
            return false;
        }
        return true;
    }
    
    public String getT(){
        return T;
    }
    
    public boolean CheckOpr(String O){
        if (O.equals("+") || O.equals("-") || O.equals("x") || O.equals(":")){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean CheckSpace(char O){
        if(O == ' '){
            return true;
        } else {
            return false;
        }
    }
    
    /*public boolean CheckValid(String[] S){
        int kurb = 0;
        int kurt = 0;
        int opr = 0; 
        int num = 0;
        
        for (int x = 0; x < S.length; x++) {
            if (S[x] == "Kurung buka"){
                kurb++;
            } else if (S[x] == "Operator"){
                opr++;
            } else if (S[x] == "Number") {
                num++;
            } else {
                kurt++;
            }
        }
        
        
        if ((num/opr == 2) && (num%2 == 0)){
            return true;
        } else {
            return false;
        }
    }*/
    
    
    
}
