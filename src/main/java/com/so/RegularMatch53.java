package com.so;

/**
 * 第53题
 * 正则表达式匹配字符串,实现一个函数用来匹配包括'.'和'*'的正则表达式
 * 其中'*'表示它前面的字符可以出现任意次（包含0次）
 *
 * @author qgl
 * @date 2017/08/29
 */
public class RegularMatch53 {

    /**
     * 是否匹配
     * @param str
     * @param pattern
     * @return
     */
    public static boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }
        // 若字符串的长度为1
        if (str.length == 1 && pattern.length == 1) {
            return str[0] == pattern[0] || pattern[0] == '.';
        }

        return matchIndex(str,0,pattern,0);
    }

    public static boolean matchIndex(char[] str,int sIndex, char[] pattern, int pIndex) {
        // str和pattern同时到达末尾，则匹配成功
        if (sIndex == str.length && pIndex == pattern.length)
            return true;
        // 若pattern先到尾，而str没有到达末尾，则匹配失败
        if (sIndex != str.length && pIndex == pattern.length)
            return false;
        // 若pattern第二个字符是*
        if (pIndex + 1 < pattern.length && pattern[pIndex + 1] == '*') {
            if (sIndex != str.length && pattern[pIndex] == str[sIndex] ||
                    sIndex != str.length && pattern[pIndex] == '.') {
                return matchIndex(str,sIndex+1,pattern,pIndex+2)
                        || matchIndex(str,sIndex,pattern,pIndex+2)
                        || matchIndex(str,sIndex+1,pattern,pIndex);
            } else {
                return matchIndex(str,sIndex,pattern,pIndex+2);
            }
        }
        // 若pattern第二个字符不是*
        if (sIndex != str.length && pattern[pIndex] == str[sIndex] ||
                sIndex != str.length && pattern[pIndex] == '.')
            return matchIndex(str,sIndex+1,pattern,pIndex+1);
        return false;
    }

}
