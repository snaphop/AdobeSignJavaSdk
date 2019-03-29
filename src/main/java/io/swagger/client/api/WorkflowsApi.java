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

import io.swagger.client.model.ApiCallback;
import io.swagger.client.model.ApiClient;
import io.swagger.client.model.ApiException;
import io.swagger.client.model.ApiResponse;
import io.swagger.client.model.Configuration;
import io.swagger.client.model.Pair;
import io.swagger.client.model.ProgressRequestBody;
import io.swagger.client.model.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.workflows.UserWorkflows;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkflowsApi {
    private ApiClient apiClient;

    public WorkflowsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkflowsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getWorkflows
     * @param authorization An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;workflow_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;workflow_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;workflow_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. (required)
     * @param xApiUser The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. (optional)
     * @param includeDraftWorkflows Include draft workflows (optional)
     * @param includeInactiveWorkflows Include inactive workflows (optional)
     * @param groupId The group identifier for which the workflows will be fetched (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWorkflowsCall(String authorization, String xApiUser, Boolean includeDraftWorkflows, Boolean includeInactiveWorkflows, String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workflows";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (includeDraftWorkflows != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("includeDraftWorkflows", includeDraftWorkflows));
        if (includeInactiveWorkflows != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("includeInactiveWorkflows", includeInactiveWorkflows));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("groupId", groupId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (xApiUser != null)
        localVarHeaderParams.put("x-api-user", apiClient.parameterToString(xApiUser));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getWorkflowsValidateBeforeCall(String authorization, String xApiUser, Boolean includeDraftWorkflows, Boolean includeInactiveWorkflows, String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getWorkflows(Async)");
        }
        

        com.squareup.okhttp.Call call = getWorkflowsCall(authorization, xApiUser, includeDraftWorkflows, includeInactiveWorkflows, groupId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves workflows for a user.
     * 
     * @param authorization An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;workflow_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;workflow_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;workflow_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. (required)
     * @param xApiUser The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. (optional)
     * @param includeDraftWorkflows Include draft workflows (optional)
     * @param includeInactiveWorkflows Include inactive workflows (optional)
     * @param groupId The group identifier for which the workflows will be fetched (optional)
     * @return UserWorkflows
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserWorkflows getWorkflows(String authorization, String xApiUser, Boolean includeDraftWorkflows, Boolean includeInactiveWorkflows, String groupId) throws ApiException {
        ApiResponse<UserWorkflows> resp = getWorkflowsWithHttpInfo(authorization, xApiUser, includeDraftWorkflows, includeInactiveWorkflows, groupId);
        return resp.getData();
    }

    /**
     * Retrieves workflows for a user.
     * 
     * @param authorization An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;workflow_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;workflow_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;workflow_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. (required)
     * @param xApiUser The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. (optional)
     * @param includeDraftWorkflows Include draft workflows (optional)
     * @param includeInactiveWorkflows Include inactive workflows (optional)
     * @param groupId The group identifier for which the workflows will be fetched (optional)
     * @return ApiResponse&lt;UserWorkflows&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserWorkflows> getWorkflowsWithHttpInfo(String authorization, String xApiUser, Boolean includeDraftWorkflows, Boolean includeInactiveWorkflows, String groupId) throws ApiException {
        com.squareup.okhttp.Call call = getWorkflowsValidateBeforeCall(authorization, xApiUser, includeDraftWorkflows, includeInactiveWorkflows, groupId, null, null);
        Type localVarReturnType = new TypeToken<UserWorkflows>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves workflows for a user. (asynchronously)
     * 
     * @param authorization An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;workflow_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;workflow_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;workflow_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. (required)
     * @param xApiUser The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. (optional)
     * @param includeDraftWorkflows Include draft workflows (optional)
     * @param includeInactiveWorkflows Include inactive workflows (optional)
     * @param groupId The group identifier for which the workflows will be fetched (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWorkflowsAsync(String authorization, String xApiUser, Boolean includeDraftWorkflows, Boolean includeInactiveWorkflows, String groupId, final ApiCallback<UserWorkflows> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getWorkflowsValidateBeforeCall(authorization, xApiUser, includeDraftWorkflows, includeInactiveWorkflows, groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserWorkflows>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
