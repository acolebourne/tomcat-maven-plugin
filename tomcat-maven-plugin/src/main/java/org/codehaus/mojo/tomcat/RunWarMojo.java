package org.codehaus.mojo.tomcat;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


/**
 * Runs the current project as a packaged web application using an embedded Tomcat server.
 * 
 * @goal run-war
 * @execute phase="package"
 * @requiresDependencyResolution runtime
 * @author Mark Hobson <markhobson@gmail.com>
 * @version $Id: RunWarMojo.java 12852 2010-10-12 22:04:32Z thragor $
 * @todo depend on war:exploded when MNG-1649 resolved
 */
public class RunWarMojo
    extends AbstractRunWarMojo
{
 // no-op : only mojo metadata overriding
}
