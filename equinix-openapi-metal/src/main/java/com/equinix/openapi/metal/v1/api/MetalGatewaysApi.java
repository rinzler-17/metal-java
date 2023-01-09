/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.api;

import com.equinix.openapi.ApiCallback;
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.ApiResponse;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.Pair;
import com.equinix.openapi.ProgressRequestBody;
import com.equinix.openapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.equinix.openapi.metal.v1.model.CreateMetalGatewayRequest;
import com.equinix.openapi.metal.v1.model.Error;
import com.equinix.openapi.metal.v1.model.MetalGateway;
import com.equinix.openapi.metal.v1.model.MetalGatewayList;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MetalGatewaysApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MetalGatewaysApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetalGatewaysApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createMetalGateway
     * @param projectId Project UUID (required)
     * @param createMetalGatewayRequest Metal Gateway to create (required)
     * @param page Page to return (optional, default to 1)
     * @param perPage Items returned per page (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createMetalGatewayCall(UUID projectId, CreateMetalGatewayRequest createMetalGatewayRequest, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createMetalGatewayRequest;

        // create path and map variables
        String localVarPath = "/projects/{project_id}/metal-gateways"
            .replace("{" + "project_id" + "}", localVarApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "x_auth_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createMetalGatewayValidateBeforeCall(UUID projectId, CreateMetalGatewayRequest createMetalGatewayRequest, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling createMetalGateway(Async)");
        }

        // verify the required parameter 'createMetalGatewayRequest' is set
        if (createMetalGatewayRequest == null) {
            throw new ApiException("Missing the required parameter 'createMetalGatewayRequest' when calling createMetalGateway(Async)");
        }

        return createMetalGatewayCall(projectId, createMetalGatewayRequest, page, perPage, _callback);

    }

    /**
     * Create a metal gateway
     * Create a metal gateway in a project
     * @param projectId Project UUID (required)
     * @param createMetalGatewayRequest Metal Gateway to create (required)
     * @param page Page to return (optional, default to 1)
     * @param perPage Items returned per page (optional, default to 10)
     * @return MetalGateway
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public MetalGateway createMetalGateway(UUID projectId, CreateMetalGatewayRequest createMetalGatewayRequest, Integer page, Integer perPage) throws ApiException {
        ApiResponse<MetalGateway> localVarResp = createMetalGatewayWithHttpInfo(projectId, createMetalGatewayRequest, page, perPage);
        return localVarResp.getData();
    }

    /**
     * Create a metal gateway
     * Create a metal gateway in a project
     * @param projectId Project UUID (required)
     * @param createMetalGatewayRequest Metal Gateway to create (required)
     * @param page Page to return (optional, default to 1)
     * @param perPage Items returned per page (optional, default to 10)
     * @return ApiResponse&lt;MetalGateway&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MetalGateway> createMetalGatewayWithHttpInfo(UUID projectId, CreateMetalGatewayRequest createMetalGatewayRequest, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = createMetalGatewayValidateBeforeCall(projectId, createMetalGatewayRequest, page, perPage, null);
        Type localVarReturnType = new TypeToken<MetalGateway>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a metal gateway (asynchronously)
     * Create a metal gateway in a project
     * @param projectId Project UUID (required)
     * @param createMetalGatewayRequest Metal Gateway to create (required)
     * @param page Page to return (optional, default to 1)
     * @param perPage Items returned per page (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createMetalGatewayAsync(UUID projectId, CreateMetalGatewayRequest createMetalGatewayRequest, Integer page, Integer perPage, final ApiCallback<MetalGateway> _callback) throws ApiException {

        okhttp3.Call localVarCall = createMetalGatewayValidateBeforeCall(projectId, createMetalGatewayRequest, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<MetalGateway>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteMetalGateway
     * @param id Metal Gateway UUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> no content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteMetalGatewayCall(UUID id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/metal-gateways/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "x_auth_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteMetalGatewayValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteMetalGateway(Async)");
        }

        return deleteMetalGatewayCall(id, _callback);

    }

    /**
     * Deletes the metal gateway
     * Deletes a specific metal gateway
     * @param id Metal Gateway UUID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> no content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public void deleteMetalGateway(UUID id) throws ApiException {
        deleteMetalGatewayWithHttpInfo(id);
    }

    /**
     * Deletes the metal gateway
     * Deletes a specific metal gateway
     * @param id Metal Gateway UUID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> no content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteMetalGatewayWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = deleteMetalGatewayValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Deletes the metal gateway (asynchronously)
     * Deletes a specific metal gateway
     * @param id Metal Gateway UUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> no content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteMetalGatewayAsync(UUID id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteMetalGatewayValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for findMetalGatewayById
     * @param id Metal Gateway UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findMetalGatewayByIdCall(UUID id, List<String> include, List<String> exclude, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/metal-gateways/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (include != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "include", include));
        }

        if (exclude != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "exclude", exclude));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "x_auth_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findMetalGatewayByIdValidateBeforeCall(UUID id, List<String> include, List<String> exclude, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling findMetalGatewayById(Async)");
        }

        return findMetalGatewayByIdCall(id, include, exclude, _callback);

    }

    /**
     * Returns the metal gateway
     * Returns a specific metal gateway
     * @param id Metal Gateway UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @return MetalGateway
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public MetalGateway findMetalGatewayById(UUID id, List<String> include, List<String> exclude) throws ApiException {
        ApiResponse<MetalGateway> localVarResp = findMetalGatewayByIdWithHttpInfo(id, include, exclude);
        return localVarResp.getData();
    }

    /**
     * Returns the metal gateway
     * Returns a specific metal gateway
     * @param id Metal Gateway UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @return ApiResponse&lt;MetalGateway&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MetalGateway> findMetalGatewayByIdWithHttpInfo(UUID id, List<String> include, List<String> exclude) throws ApiException {
        okhttp3.Call localVarCall = findMetalGatewayByIdValidateBeforeCall(id, include, exclude, null);
        Type localVarReturnType = new TypeToken<MetalGateway>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns the metal gateway (asynchronously)
     * Returns a specific metal gateway
     * @param id Metal Gateway UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findMetalGatewayByIdAsync(UUID id, List<String> include, List<String> exclude, final ApiCallback<MetalGateway> _callback) throws ApiException {

        okhttp3.Call localVarCall = findMetalGatewayByIdValidateBeforeCall(id, include, exclude, _callback);
        Type localVarReturnType = new TypeToken<MetalGateway>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findMetalGatewaysByProject
     * @param projectId Project UUID (required)
     * @param page Page to return (optional, default to 1)
     * @param perPage Items returned per page (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findMetalGatewaysByProjectCall(UUID projectId, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{project_id}/metal-gateways"
            .replace("{" + "project_id" + "}", localVarApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "x_auth_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findMetalGatewaysByProjectValidateBeforeCall(UUID projectId, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling findMetalGatewaysByProject(Async)");
        }

        return findMetalGatewaysByProjectCall(projectId, page, perPage, _callback);

    }

    /**
     * Returns all metal gateways for a project
     * Return all metal gateways for a project
     * @param projectId Project UUID (required)
     * @param page Page to return (optional, default to 1)
     * @param perPage Items returned per page (optional, default to 10)
     * @return MetalGatewayList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public MetalGatewayList findMetalGatewaysByProject(UUID projectId, Integer page, Integer perPage) throws ApiException {
        ApiResponse<MetalGatewayList> localVarResp = findMetalGatewaysByProjectWithHttpInfo(projectId, page, perPage);
        return localVarResp.getData();
    }

    /**
     * Returns all metal gateways for a project
     * Return all metal gateways for a project
     * @param projectId Project UUID (required)
     * @param page Page to return (optional, default to 1)
     * @param perPage Items returned per page (optional, default to 10)
     * @return ApiResponse&lt;MetalGatewayList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MetalGatewayList> findMetalGatewaysByProjectWithHttpInfo(UUID projectId, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = findMetalGatewaysByProjectValidateBeforeCall(projectId, page, perPage, null);
        Type localVarReturnType = new TypeToken<MetalGatewayList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns all metal gateways for a project (asynchronously)
     * Return all metal gateways for a project
     * @param projectId Project UUID (required)
     * @param page Page to return (optional, default to 1)
     * @param perPage Items returned per page (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findMetalGatewaysByProjectAsync(UUID projectId, Integer page, Integer perPage, final ApiCallback<MetalGatewayList> _callback) throws ApiException {

        okhttp3.Call localVarCall = findMetalGatewaysByProjectValidateBeforeCall(projectId, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<MetalGatewayList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
