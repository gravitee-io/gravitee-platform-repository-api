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
 * @author David BRASSELY (david.brassely at graviteesource.com)
 * @author Jeoffrey HAEYAERT (jeoffrey.haeyaert at graviteesource.com)
 * @author GraviteeSource Team
 */
public enum Scope {
    /*
     * All scopes are centralized here in order to keep naming coherency between all Gravitee components.
     */
    OAUTH2("oauth2"),
    MANAGEMENT("management"),
    GATEWAY("gateway"),
    RATE_LIMIT("ratelimit"),
    ANALYTICS("analytics"),
    KEY_VALUE("keyvalue"),
    DISTRIBUTED_SYNC("distributed-sync");

    String name;

    Scope(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
