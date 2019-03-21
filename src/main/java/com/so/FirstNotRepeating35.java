package com.so;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * 第35题
 * 在字符串中找出第一个只出现一次的字符
 *
 * @author qgl
 * @date 2017/08/15
 */
public class FirstNotRepeating35 {
    /**
     * 获取第一个只出现一次的字符的下标
     *
     * @param str
     * @return
     */
    public static int getFirstNotRepeatingCharIndex(String str) {
        if (str == null) {
            return -1;
        }
        char[] strChar = str.toCharArray();
        // 按照插入顺序保存key的位置
        LinkedHashMap<Character, Integer> hash = new LinkedHashMap<Character, Integer>();
        for (char item : strChar) {
            if (hash.containsKey(item)) {
                hash.put(item, hash.get(item) + 1);
            } else {
                hash.put(item, 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hash.get(c) == 1) {
                System.out.println("第一个只出现一次的字符是：" + c);
                return i;
            }
        }

        return -1;
    }

}
