package com.sap.sapstore.jerserwspring.impl;

import junit.framework.TestCase;
import com.sap.sapstore.jerserwspring.Bean;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());
    }

}