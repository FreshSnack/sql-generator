package net.ruixin.biz;

import lombok.Data;
import net.ruixin.enzm.AssociateType;

/**
 * 关联关系
 */
@Data
public class Association implements Relation {

    /*关联类型*/
    private AssociateType associateType = AssociateType.ONE_TO_MANY;

    /*关系主对象*/
    private BizClass masterClass;

    /*关系从对象*/
    private BizClass salveClass;

}
