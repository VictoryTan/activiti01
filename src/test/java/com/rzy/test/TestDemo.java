package com.rzy.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

/**
 * @author tanshiwei
 * @date 2021/11/24
 */

public class TestDemo {



    /**
     * 生成 activiti的数据库表
     */
    @Test
    public void testCreateDbTable() {
        //使用classpath下的activiti.cfg.xml中的配置创建processEngine
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        System.out.println(processEngine);
    }
}