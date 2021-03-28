package com.yang.mall;

import org.springframework.messaging.SubscribableChannel;
import sun.util.resources.cldr.ii.CurrencyNames_ii;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/27 16:08
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int T = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < T; i ++) {
                int n = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                beauty(s);
            }
        }
    }

    private static void beauty(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equals(s)) {
            System.out.println(s);
        } else {
            char[] c = s.toCharArray();
            int flag = 0;
            int cur1 = 0;
            int cur2 = c.length - 1;
            while (cur1 <= cur2) {
                if (flag > 1) {
                    c = s.toCharArray();
                    break;
                }
                if (c[cur1] != c[cur2]) {
                    flag ++;
                    if (c[cur1] < c[cur2]) {
                        c[cur2] = c[cur1];
                    } else {
                        c[cur1] = c[cur2];
                    }
                }
                cur1 ++;
                cur2 --;
            }
            if (flag == 1) {
                System.out.println(String.valueOf(c));
                return;
            }
            for (int i = 0; i < c.length; i ++) {
                if (c[i] - '0' > 0) {
                    c[i] = '0';
                    break;
                }
            }
            System.out.println(String.valueOf(c));
        }
    }
}
