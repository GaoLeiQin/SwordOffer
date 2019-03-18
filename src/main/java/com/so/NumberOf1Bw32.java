package com.so;

/**
 * 第32题
 * 输入一个整数n,求从1到n这N个十进制表示中1出现的次数
 *
 * @author qgl
 * @date 2017/08/14
 */
public class NumberOf1Bw32 {

    /**
     * 解法一
     * 主要思路：设定整数点作为位置点i（对应n的个位、十位等），分别对每个数位上有多少包含1的点进行分析
     * 根据设定的整数位置，对n进行分割，分为高位和低位
     * 当i表示百位，且百位对应的数>=2,如n=31456,i=100，则a=314,b=56，此时百位为1的次数有a/10+1=32（最高两位0~31），
     * 每一次都包含100个连续的点，即共有(a%10+1)*100个点的百位为1
     * 当i表示百位，且百位对应的数为1，如n=31156,i=100，则a=311,b=56，此时百位对应的就是1，则共有a%10(最高两位0-30)次是
     * 包含100个连续点，当最高两位为31（即a=311），本次只对应局部点00~56，共b+1次，所有点加起来共有（a%10*100）+(b+1)，这些点百位对应为1
     * 当i表示百位，且百位对应的数为0,如n=31056,i=100，则a=310,b=56，此时百位为1的次数有a/10=31（最高两位0~30）
     * 综合以上三种情况，当百位对应0或>=2时，有(a+8)/10次包含所有100个点，还有当百位为1(a%10==1)，需要增加局部点b+1
     * 补8是因为当百位为0，则a/10==(a+8)/10，当百位>=2，补8会产生进位位，效果等同于(a/10+1)
     *
     * @param n
     * @return
     */
    public static int NumberOf1Between1AndN1(int n) {
        int count = 0;

        for (int i = 1; i <= n; i *= 10) {
            int a = n / i; // 高位
            int b = n % i; // 低位
            count += (a + 8) / 10 * i;
            if (a % 10 == 1) {
                count += b + 1;
            }
        }
        return count;
    }

    /**
     * 解法二
     *
     * @param n
     * @return
     */
    public static long NumberOf1Between1AndN2(long n) {
        long count = 0; // 1的个数
        long i = 1;  // 当前位
        long current = 0, after = 0, before = 0;

        while ((n / i) != 0) {
            before = n / (i * 10); // 高位
            current = (n / i) % 10; // 当前位
            after = n - (n / i) * i;  // 低位

            if (current == 0) {
                //如果为0,出现1的次数由高位决定,等于高位数字 * 当前位数
                count = count + before * i;
            } else if (current == 1) {
                //如果为1,出现1的次数由高位和低位决定,高位*当前位+低位+1
                count = count + before * i + after + 1;
            } else if (current > 1) {
                // 如果大于1,出现1的次数由高位决定,（高位数字+1）* 当前位数
                count = count + (before + 1) * i;
            }
            //前移一位
            i = i * 10;
        }
        return count;
    }

    /**
     * 解法三：不推荐，时间复杂度高
     *
     * @param n
     * @return
     */
    public static int NumberOf1Between1AndN3(int n) {
        if (n <= 0) {
            return 0;
        }
        int count = 0;

        for (int i = 1; i < n + 1; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                if ('1' == s.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

}
