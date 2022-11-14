package com.chuwa.springbasic.service.coupling;

import com.chuwa.springbasic.components.JpaChuwa;

/**
 * @author b1go
 * @date 9/1/22 12:12 AM
 */
public class LooseCoupling {

    /**
     * 1) 使用 interface
     * 2) 使用aggregation in constructor
     * 如果想换成EclipseLinkChuwa, 则只需在new该class时候，传入eclipsLinkChuwa。
     * 耦合性比tight松散，灵活性也更强。
     */
    private JpaChuwa jpaChuwa;

    public LooseCoupling(JpaChuwa jpaChuwa) {
        this.jpaChuwa = jpaChuwa;
    }

    public void printMessage() {
        jpaChuwa.printMessage();
    }
}
