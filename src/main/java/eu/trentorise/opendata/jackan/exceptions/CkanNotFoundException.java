/*
 * Copyright 2015 Trento Rise.
 *
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
 */
package eu.trentorise.opendata.jackan.exceptions;

import eu.trentorise.opendata.jackan.CkanClient;
import eu.trentorise.opendata.jackan.model.CkanResponse;

/**
 * Thrown when Ckan tells us something was not found. Notice this is not related
 * to more generic {@link JackanNotFoundException}
 *
 * @author David Leoni
 */
public class CkanNotFoundException extends CkanException {

    public CkanNotFoundException(String msg, CkanResponse ckanResponse, CkanClient client) {
        super(msg, ckanResponse, client);
    }

    public CkanNotFoundException(String msg, CkanResponse ckanResponse, CkanClient client, Throwable ex) {
        super(msg, ckanResponse, client, ex);
    }

}