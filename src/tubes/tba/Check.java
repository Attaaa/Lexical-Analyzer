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
    
    public boolean CheckValid(String[] S, int i){
        int opr = 0;
        int num = 0;
        int kurb = 0;
        int kurt = 0;
        int j = 0;
        
        if (!CheckOpr(S[j]) && !CheckOpr(S[i-1])) {
            for (j = 0; j < i; j++) {
                if (!CheckKrg(S[j].charAt(0))){
                    if (CheckNum(S[j])) {
                        num++;
                        if (j < i-1 && CheckNum(S[j+1])){
                            return false;
                        }
                    } else if (CheckOpr(S[j])) {
                        opr++;
                    } else {
                        return false;
                    }
                } else  {
                    if (S[j].equals("(")){
                        kurb++;
                        if (j < i-1 && CheckOpr(S[j+1])){
                            return false;
                        }
                        if (j > 1 && CheckNum(S[j-1])){
                            return false;
                        }
                    } else {
                        kurt++;
                        if (j < i-1 && CheckNum(S[j+1])){
                            return false;
                        }
                        if (j > 1 && CheckOpr(S[j-1])){
                            return false;
                        }
                    }
                }
            }
        }
        if (num >= 1 && opr == num-1){
            if (kurb == kurt){
                return true;
            }
        }
        return false;
    }
}
