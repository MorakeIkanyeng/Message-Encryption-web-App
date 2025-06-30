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
public interface MessageInterface {
    String encrypt(String msg);
    
    String decrypt(String msg);
}
