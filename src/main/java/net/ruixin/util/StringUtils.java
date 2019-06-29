package net.ruixin.util;

/**
 * 字符串工具类
 */
public class StringUtils {

    /**
     * 是否为空字符串
     * @param s
     * @return
     */
    public static boolean isNullString(String s) {
        if(s == null || s.length() == 0) {
            return true;
        }
        return false;
    }

}
