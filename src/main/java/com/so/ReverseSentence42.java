package com.so;

/**
 * 第42题
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变
 *
 * @author qgl
 * @date 2017/08/16
 */
public class ReverseSentence42 {
    /**
     * 翻转字符串内的单词顺序
     *
     * @param sentence
     * @return
     */
    public static String reverseSentence(String sentence) {
        if (sentence == null || sentence.length() == 0 || sentence.trim().length() == 0) {
            return sentence;
        }
        String blank = " ";
        String sentenceReverse = reverse(sentence);
        String[] splitStrings = sentenceReverse.split(blank);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < splitStrings.length - 1; i++) {
            sb.append(reverse(splitStrings[i])).append(blank);
        }
        sb.append(reverse(splitStrings[splitStrings.length - 1]));
        return String.valueOf(sb);
    }

    /**
     * 翻转字符串
     *
     * @param str
     * @return
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.substring(i, i + 1));
        }
        return String.valueOf(sb);
    }

    /**
     * 字符串的左旋
     *
     * @param sentence abcdefg
     * @param index    2
     * @return cdefgab
     */
    public static String leftRotateString(String sentence, int index) {
        if (sentence == null || index > sentence.length() || index < 0) {
            return null;
        }
        String sentenceReverse = reverse(sentence);
        String[] splitStrings = {sentenceReverse.substring(0, sentence.length() - index),
                sentenceReverse.substring(sentence.length() - index, sentence.length())};
        StringBuilder sb = new StringBuilder();
        for (String s : splitStrings) {
            sb.append(reverse(s));
        }
        return String.valueOf(sb);
    }
}
