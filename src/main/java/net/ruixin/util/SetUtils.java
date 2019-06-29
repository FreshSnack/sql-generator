package net.ruixin.util;

import java.util.List;

/**
 * 集合工具类
 */
public class SetUtils {

    /**
     * 是否为空list
     * @param list
     * @return
     */
    public static boolean isNullList(List<?> list) {
        if(list == null || list.size() == 0) {
            return true;
        }
        return false;
    }
}
