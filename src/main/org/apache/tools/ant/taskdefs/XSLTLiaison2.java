/*
 * Copyright  2003-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.tools.ant.taskdefs;

/**
 * Extended Proxy interface for XSLT processors.
 *
 * @author Conor MacNeill
 * @see XSLTProcess
 * @since Ant 1.6
 */
public interface XSLTLiaison2 extends XSLTLiaison {
    /**
     * Configure the liasion from the XSLTProcess task
     */
    void configure(XSLTProcess xsltTask);
}
