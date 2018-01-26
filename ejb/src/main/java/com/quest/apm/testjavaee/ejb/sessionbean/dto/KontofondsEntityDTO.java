package com.quest.apm.testjavaee.ejb.sessionbean.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rxiao on 8/8/2017.
 */
public class KontofondsEntityDTO implements Serializable {
    private KontofondsDTO dto;

    public KontofondsEntityDTO(KontofondsDTO dto) {
        List<String> s = new ArrayList<String>();
        this.dto = dto;
    }
}
