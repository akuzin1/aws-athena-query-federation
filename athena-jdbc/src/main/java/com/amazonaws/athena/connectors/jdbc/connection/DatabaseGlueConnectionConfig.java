/*-
 * #%L
 * athena-jdbc
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
package com.amazonaws.athena.connectors.jdbc.connection;

import org.apache.commons.lang3.Validate;

import java.util.Objects;

/**
 * Encapsulates database JDBC Glue connection configuration.
 */
public class DatabaseGlueConnectionConfig extends DatabaseConnectionConfig{
    private final String username;
    private final String password;

    public DatabaseGlueConnectionConfig(final String catalog, final String engine, final String jdbcConnectionString, String username, String password, final String secret){
        super(catalog, engine, jdbcConnectionString, secret);
        this.password = password;
        this.username = username;
    }

    public DatabaseGlueConnectionConfig(final String catalog, final String engine, final String jdbcConnectionString, String username, String password){
        super(catalog, engine, jdbcConnectionString);
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isGlueConnection() {
        return true;
    }
}
