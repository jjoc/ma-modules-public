/*
    Copyright (C) 2006-2011 Serotonin Software Technologies Inc. All rights reserved.
    @author Matthew Lohbihler
 */
package com.serotonin.m2m2.pointLinks;

import com.serotonin.m2m2.module.DwrDefinition;
import com.serotonin.m2m2.web.dwr.ModuleDwr;

public class PointLinkDwrDefinition extends DwrDefinition {
    @Override
    public Class<? extends ModuleDwr> getDwrClass() {
        return PointLinksDwr.class;
    }
}
