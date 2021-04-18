package com.yang.mall.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Main {
    static Set<String> set=new HashSet<String>();
    public static String[] permutation(String s) {
        char[] chs=s.toCharArray();
        set=process(chs,0);
        String[] str=new String[set.size()];
        int num=0;
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            str[num]=iterator.next();
            num++;
        }
        return str;
    }
    public static Set<String> process(char[] chs,int i){
        //i表示递归到哪一个位置了
        if(i==chs.length){
            if(!set.contains(String.valueOf(chs))){
                set.add(String.valueOf(chs));
            }
        }
        for(int j=i;j<chs.length;j++){
            //确定第一个位置
            swap(chs,i,j);
            //确定i+1位置
            process(chs,i+1);
        }
        return set;
    }


    public static void swap(char[]chs,int i,int j){
        char tmp=chs[i];
        chs[i]=chs[j];
        chs[j]=tmp;
    }

    public static void main(String[] args) {
        String s = "aab";
        String[] str = permutation(s);
        System.out.println();
    }
}