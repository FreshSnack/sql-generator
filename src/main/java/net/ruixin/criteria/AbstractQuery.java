package net.ruixin.criteria;

import net.ruixin.biz.BizClass;

public interface AbstractQuery {

    Root from(BizClass bizClass);
}
