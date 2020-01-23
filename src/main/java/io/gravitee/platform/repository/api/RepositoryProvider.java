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

/*
 * @author Jeoffrey HAEYAERT (jeoffrey.haeyaert at graviteesource.com)
 * @author GraviteeSource Team
 */
public interface RepositoryProvider {

    /**
     * The type of the repository provider (mongodb, jpa, ...)
     *
     * @return the type of the repository provider.
     */
    String type();

    /**
     * Scopes handled by the repository implementation.
     *
     * @return all the scopes handled by the repository provider.
     */
    Scope [] scopes();

    /**
     * Retrieve a configuration class (annotated with @Configuration) for a given scope.
     *
     * @return the configuration class used to initialize all repositories for the given scope.
     */
    Class<?> configuration(Scope scope);
}