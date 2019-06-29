package net.ruixin.biz;

import lombok.Data;
import lombok.extern.log4j.Log4j;
import net.ruixin.util.SetUtils;
import net.ruixin.util.StringUtils;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * 业务对象
 */
@Data
@Log4j
public class BizClass {
    private String code;
    private String name;
    private List<BizProperty> properties;

    /**
     * 根据code获取属性
     * @param code
     * @return
     */
    public BizProperty getProperty(String code) {
        if(!SetUtils.isNullList(properties) && !StringUtils.isNullString(code)) {
            try {
                return properties.stream().filter(property-> code.equals(property.getCode())).findFirst().get();
            } catch (NoSuchElementException e) {
                log.info("property with " + code + " can not found!");
            }
        }
        return null;
    }
}
