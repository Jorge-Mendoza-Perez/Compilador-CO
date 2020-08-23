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
      public class Num extends Token {
           public final int valor;
            public Num(int v) {super(Etiqueta.NUM); valor = v;}
            public String toString() { return "" + valor; }
}
