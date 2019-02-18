package com.so;

/**
 * 第4题
 * 将一个字符串中的空格替换成"%20"
 *
 * @author qgl
 * @date 2017/08/07
 */
public class ReplaceBlank4 {

    /**
     * 解法一：使用StringBuffer
     *
     * @param input
     * @return
     */
    public static String replaceBlank1(String input) {
        if (input == null) {
            return null;
        }
        StringBuffer outputBuffer = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                outputBuffer.append("%20");
            } else {
                outputBuffer.append(String.valueOf(input.charAt(i)));
            }
        }
        return new String(outputBuffer);
    }

    /**
     * 解法二：使用StringBuilder
     *
     * @param input
     * @return
     */
    public static String replaceBlank2(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (String.valueOf(input.charAt(i)).equals(" ")) {
                sb.append("%20");
            } else {
                sb.append(input.charAt(i));
            }
        }
        return String.valueOf(sb);
    }

    /**
     * 解法三：从后往前复制
     *
     * @param input
     * @return
     */
    public static String replaceBlank3(String input) {
        if (input == null) {
            return null;
        }
        int blankNum = 0;
        int length = input.length();
        int newLength = 0;
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == ' ') {
                blankNum++;
            }
        }
        // 替换后的字符串长度
        newLength = length + 2 * blankNum;
        char[] newChars = new char[newLength];
        int index = newLength - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ') {
                newChars[index--] = '0';
                newChars[index--] = '2';
                newChars[index--] = '%';
            } else {
                newChars[index--] = input.charAt(i);
            }
        }
        return new String(newChars);
    }
}
