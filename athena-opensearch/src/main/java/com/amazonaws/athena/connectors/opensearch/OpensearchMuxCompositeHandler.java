/*-
 * #%L
 * athena-mysql
 * %%
 * Copyright (C) 2019 Amazon Web Services
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.amazonaws.athena.connectors.mysql;

import com.amazonaws.athena.connectors.jdbc.MultiplexingJdbcCompositeHandler;

/**
 * Boilerplate composite handler that allows us to use a single Lambda function for both
 * Metadata and Data. In this case we just compose {@link MySqlMuxMetadataHandler} and {@link MySqlMuxRecordHandler}.
 */
public class MySqlMuxCompositeHandler
        extends MultiplexingJdbcCompositeHandler
{
    public MySqlMuxCompositeHandler() throws java.lang.ReflectiveOperationException
    {
        super(MySqlMuxMetadataHandler.class, MySqlMuxRecordHandler.class, OpensearchMetadataHandler.class, OpensearchRecordHandler.class);
    }
}
