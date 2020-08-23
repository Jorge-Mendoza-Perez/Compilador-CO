/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge Mendoza
 */
package analizadorLexico;
public class Token {
    public final int etiqueta;
     public Token(int t) {etiqueta = t;}
     public String toString() {return "" + (char)etiqueta;}
}
