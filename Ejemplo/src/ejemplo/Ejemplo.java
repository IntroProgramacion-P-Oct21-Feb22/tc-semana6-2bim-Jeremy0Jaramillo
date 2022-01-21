/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import org.apache.commons.lang3.RandomUtils;

/**
 *
 * @author reroes
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] a = new int[10];

        for (int b = 0; b < a.length; b++) {
            a[b] = RandomUtils.nextInt(100, 110);
        }

        for (int c = 0; c < a.length; c++) {
            System.out.printf("%d\t", a[c]);
        }
    }

}
