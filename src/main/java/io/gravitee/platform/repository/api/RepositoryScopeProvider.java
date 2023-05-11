/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.platform.repository.api;

/**
 * @author Jeoffrey HAEYAERT (jeoffrey.haeyaert at graviteesource.com)
 * @author GraviteeSource Team
 */
public interface RepositoryScopeProvider {
    /**
     * Repository implementations must implement this method in order to list all the repository scopes they can handle.
     *
     * @return all the repository scopes handled.
     * @see Scope
     */
    Scope[] getHandledScopes();

    /**
     * Repository implementations must implement this method in order to list all the optional repository scopes they can handle.
     * Any missing scope configuration will be ignored.
     *
     * @return all the repository scopes optionally handled.
     * @see Scope
     */
    default Scope[] getOptionalHandledScopes() {
        return new Scope[] {};
    }
}
