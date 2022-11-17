package com.chuwa.springbasic.service.coupling;

import com.chuwa.springbasic.components.impl.EclipseLinkChuwa;
import com.chuwa.springbasic.components.impl.HibernateChuwa;

/**
 * @author b1go
 * @date 9/1/22 12:12 AM
 */
public class TightCoupling {

    /**
     * 1) == 号左边没有使用interface，
     * 2) 使用了new operator
     * 如果想换成EclipseLinkChuwa, 则需要改source code。
     * 如果我们项目比较大有很多new HibernateChuwa()，则要改很多。还可能会漏掉。
     */
    private HibernateChuwa hibernateChuwa = new HibernateChuwa();
//    private EclipseLinkChuwa eclipseLinkChuwa = new EclipseLinkChuwa();

    public void printMessage() {
        hibernateChuwa.printMessage();
    }
}
