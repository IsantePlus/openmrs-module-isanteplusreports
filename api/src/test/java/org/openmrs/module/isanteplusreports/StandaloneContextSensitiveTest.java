/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.isanteplusreports;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.openmrs.test.BaseModuleContextSensitiveTest;

public abstract class StandaloneContextSensitiveTest extends BaseModuleContextSensitiveTest {
    
    @Override
    public Properties getRuntimeProperties() {
        Properties p = super.getRuntimeProperties();
        String url = "jdbc:h2:mem:isanteplus;" + "INIT=CREATE SCHEMA IF NOT EXISTS isanteplus\\;"
                + "RUNSCRIPT FROM 'classpath:org/openmrs/module/isanteplusreports/sql/init.sql'\\;"
                + "RUNSCRIPT FROM 'classpath:org/openmrs/module/isanteplusreports/sql/data.sql'\\;"
                + ";DB_CLOSE_DELAY=30;LOCK_TIMEOUT=10000";
        p.setProperty(Environment.URL, url);
        
        return p;
    }
}
