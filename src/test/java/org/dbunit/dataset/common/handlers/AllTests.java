/*
 *
 * The DbUnit Database Testing Framework
 * Copyright (C)2008, DbUnit.org
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
package org.dbunit.dataset.common.handlers;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author gommma (gommma AT users.sourceforge.net)
 * @author Last changed by: $Author: gommma $
 * @version $Revision: 817 $ $Date: 2008-09-29 22:23:35 +0200 (h, 29 szept 2008) $
 * @since 2.4.0
 */
public class AllTests extends TestSuite
{
    public static Test suite()
    {
        TestSuite suite = new TestSuite();
        suite.addTest(new TestSuite(EnforceHandlerTest.class));
        suite.addTest(new TestSuite(HandlersTest.class));
        suite.addTest(new TestSuite(PipelineTest.class));
        return suite;
    }
}