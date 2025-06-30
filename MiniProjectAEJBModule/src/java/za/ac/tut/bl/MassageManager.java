/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

/**
 *
 * @author morak
 */
public class MassageManager implements MessageInterface{

    @Override
    public String encrypt(String msg) {
        String message = msg.toLowerCase();
        String encrypted = "";
        
        if(!msg.isEmpty()){
            for(int x =0; x<message.length();x++){
                char chara= message.charAt(x);
                if( chara == 'a'){
                    encrypted = encrypted + "1";
                }else if(chara == 'e'){
                    encrypted = encrypted.concat("2");
                }else if(chara == 'i'){
                    encrypted = encrypted + "3";
                }else if(chara == 'o'){
                    encrypted = encrypted + "4";
                }else if(message.charAt(x) == 'u'){
                    encrypted = encrypted + "5";
                }else{
                    encrypted = encrypted + chara;
                }
            }
        }
        return encrypted;
    } 

    @Override
    public String decrypt(String msg) {
        String message = msg.toLowerCase();
        String decrypted = "";
        
        if(!msg.isEmpty()){
            for(int x =0; x<message.length();x++){
                char chara= message.charAt(x);
                if( chara == '1'){
                    decrypted = decrypted + "a";
                }else if(chara == '2'){
                    decrypted = decrypted.concat("e");
                }else if(chara == '3'){
                    decrypted = decrypted + "i";
                }else if(chara == '4'){
                    decrypted = decrypted + "o";
                }else if(message.charAt(x) == '5'){
                    decrypted = decrypted + "u";
                }else{
                    decrypted = decrypted + chara;
                }
            }
        }
        return decrypted;
    }
    
}
