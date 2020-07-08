/**
*  Copyright 2019 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*
**/


/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.ApiException;
import java.io.File;
import io.swagger.client.model.transientDocuments.TransientDocumentResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransientDocumentsApi
 */
@Ignore
public class TransientDocumentsApiTest {

    private final TransientDocumentsApi api = new TransientDocumentsApi();

    
    /**
     * Uploads a document and obtains the document&#39;s ID.
     *
     * The document uploaded through this call is referred to as transient since it is available only for 7 days after the upload. The returned transient document ID can be used in the API calls where the uploaded file needs to be referred. The transient document request is a multipart request consisting of three parts - filename, mime type and the file stream. You can only upload one file at a time in this request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTransientDocumentTest() throws ApiException {
        String authorization = null;
        File file = null;
        String xApiUser = null;
        String xOnBehalfOfUser = null;
        String fileName = null;
        String mimeType = null;
        TransientDocumentResponse response = api.createTransientDocument(authorization, file, xApiUser, xOnBehalfOfUser, fileName, mimeType);

        // TODO: test validations
    }
    
}
