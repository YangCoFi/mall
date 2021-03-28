package com.yang.mall.leet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName IntervalScheduling
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/15 14:33
 **/
public class IntervalScheduling {

    public int intervalSchedule(int[][] intvs) {
        if (intvs == null || intvs.length == 0) {
            return 0;
        }
        Arrays.sort(intvs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int res = 1;
        int xEnd = intvs[0][1];
        for (int[] intv : intvs) {
            int start = intv[0];
            if (start >= xEnd) {
                res ++;
                xEnd = intv[1];
            }
        }
        return res;
    }

}
