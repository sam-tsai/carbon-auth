/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.auth.user.store.claim.model;

/**
 * Represents the simplest form of the metadata of a claim.
 */
public class Claim {
    private String claimDialectURI;
    private String claimURI;

    public Claim(String claimDialectURI, String claimURI) {
        this.claimDialectURI = claimDialectURI;
        this.claimURI = claimURI;
    }

    public String getClaimDialectURI() {
        return claimDialectURI;
    }

    public String getClaimURI() {
        return claimURI;
    }
}
