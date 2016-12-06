/* 
 * Copyright 2016 OpenMarket Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.matrix.androidsdk.rest.model.crypto;

import org.matrix.androidsdk.crypto.data.MXDeviceInfo;

import java.util.Map;
import java.util.Objects;

/**
 * This class represents the response to /keys/query request made by downloadKeysForUsers
 */
public class KeysQueryResponse {
    /**
     * The device keys per devices per users.
     */
    public Map<String, Map<String, MXDeviceInfo>> deviceKeys;

    /**
     *  The failures sorted by homeservers.
     */
    public Map<Object, Object> failures;
}
