package net.ruixin.test;

import net.ruixin.biz.BizClass;
import net.ruixin.biz.BizProperty;
import org.junit.Test;

import java.util.ArrayList;

public class BizClassTest {

    @Test
    public void testGetProperty() {
        BizClass bizClass = new BizClass();
        bizClass.setCode("User");
        bizClass.setName("用户");
        bizClass.setProperties(new ArrayList<BizProperty>() {
            {
                add(new BizProperty() {
                    {
                        setName("用户名");
                        setCode("username");
                    }
                });
                add(new BizProperty() {
                    {
                        setName("密码");
                        setCode("password");
                    }
                });
            }
        });
        // test getProperty
        System.out.println("-------username-------");
        System.out.println(bizClass.getProperty("username"));
        System.out.println("-------telephone-------");
        System.out.println(bizClass.getProperty("telephone"));
    }
}
