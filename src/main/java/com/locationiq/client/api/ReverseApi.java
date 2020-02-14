/*
 * LocationIQ
 * LocationIQ provides flexible enterprise-grade location based solutions. We work with developers, startups and enterprises worldwide serving billions of requests everyday. This page provides an overview of the technical aspects of our API and will help you get started.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.locationiq.client.api;

import com.locationiq.client.ApiCallback;
import com.locationiq.client.ApiClient;
import com.locationiq.client.ApiException;
import com.locationiq.client.ApiResponse;
import com.locationiq.client.Configuration;
import com.locationiq.client.Pair;
import com.locationiq.client.ProgressRequestBody;
import com.locationiq.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import com.locationiq.client.model.Error;
import com.locationiq.client.model.Location;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseApi {
    private ApiClient localVarApiClient;

    public ReverseApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReverseApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for reverse
     * @param lat Latitude of the location to generate an address for. (required)
     * @param lon Longitude of the location to generate an address for. (required)
     * @param format Format to geocode. Only JSON supported for SDKs (required)
     * @param normalizecity Normalizes village to city level data to city (required)
     * @param addressdetails Include a breakdown of the address into elements. Defaults to 1. (optional, default to 1)
     * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
     * @param namedetails Include a list of alternative names in the results. These may include language variants, references, operator and brand. (optional)
     * @param extratags Include additional information in the result if available, e.g. wikipedia link, opening hours. (optional)
     * @param statecode Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0 (optional)
     * @param showdistance Returns the straight line distance (meters) between the input location and the result&#39;s location. Value is set in the distance key of the response. Defaults to 0 [0,1] (optional)
     * @param postaladdress Returns address inside the postaladdress key, that is specifically formatted for each country. Currently supported for addresses in Germany. Defaults to 0 [0,1] (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request has been made from an unauthorized domain. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No location or places were found for the given input </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request exceeded the rate-limits set on your account </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reverseCall(BigDecimal lat, BigDecimal lon, String format, Integer normalizecity, Integer addressdetails, String acceptLanguage, Integer namedetails, Integer extratags, Integer statecode, Integer showdistance, Integer postaladdress, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/reverse.php";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (lat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lat", lat));
        }

        if (lon != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lon", lon));
        }

        if (format != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("format", format));
        }

        if (normalizecity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("normalizecity", normalizecity));
        }

        if (addressdetails != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("addressdetails", addressdetails));
        }

        if (acceptLanguage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("accept-language", acceptLanguage));
        }

        if (namedetails != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("namedetails", namedetails));
        }

        if (extratags != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("extratags", extratags));
        }

        if (statecode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("statecode", statecode));
        }

        if (showdistance != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showdistance", showdistance));
        }

        if (postaladdress != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("postaladdress", postaladdress));
        }

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call reverseValidateBeforeCall(BigDecimal lat, BigDecimal lon, String format, Integer normalizecity, Integer addressdetails, String acceptLanguage, Integer namedetails, Integer extratags, Integer statecode, Integer showdistance, Integer postaladdress, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling reverse(Async)");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling reverse(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling reverse(Async)");
        }
        
        // verify the required parameter 'normalizecity' is set
        if (normalizecity == null) {
            throw new ApiException("Missing the required parameter 'normalizecity' when calling reverse(Async)");
        }
        

        okhttp3.Call localVarCall = reverseCall(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags, statecode, showdistance, postaladdress, _callback);
        return localVarCall;

    }

    /**
     * Reverse Geocoding
     * Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.
     * @param lat Latitude of the location to generate an address for. (required)
     * @param lon Longitude of the location to generate an address for. (required)
     * @param format Format to geocode. Only JSON supported for SDKs (required)
     * @param normalizecity Normalizes village to city level data to city (required)
     * @param addressdetails Include a breakdown of the address into elements. Defaults to 1. (optional, default to 1)
     * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
     * @param namedetails Include a list of alternative names in the results. These may include language variants, references, operator and brand. (optional)
     * @param extratags Include additional information in the result if available, e.g. wikipedia link, opening hours. (optional)
     * @param statecode Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0 (optional)
     * @param showdistance Returns the straight line distance (meters) between the input location and the result&#39;s location. Value is set in the distance key of the response. Defaults to 0 [0,1] (optional)
     * @param postaladdress Returns address inside the postaladdress key, that is specifically formatted for each country. Currently supported for addresses in Germany. Defaults to 0 [0,1] (optional)
     * @return Location
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request has been made from an unauthorized domain. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No location or places were found for the given input </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request exceeded the rate-limits set on your account </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Location reverse(BigDecimal lat, BigDecimal lon, String format, Integer normalizecity, Integer addressdetails, String acceptLanguage, Integer namedetails, Integer extratags, Integer statecode, Integer showdistance, Integer postaladdress) throws ApiException {
        ApiResponse<Location> localVarResp = reverseWithHttpInfo(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags, statecode, showdistance, postaladdress);
        return localVarResp.getData();
    }

    /**
     * Reverse Geocoding
     * Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.
     * @param lat Latitude of the location to generate an address for. (required)
     * @param lon Longitude of the location to generate an address for. (required)
     * @param format Format to geocode. Only JSON supported for SDKs (required)
     * @param normalizecity Normalizes village to city level data to city (required)
     * @param addressdetails Include a breakdown of the address into elements. Defaults to 1. (optional, default to 1)
     * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
     * @param namedetails Include a list of alternative names in the results. These may include language variants, references, operator and brand. (optional)
     * @param extratags Include additional information in the result if available, e.g. wikipedia link, opening hours. (optional)
     * @param statecode Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0 (optional)
     * @param showdistance Returns the straight line distance (meters) between the input location and the result&#39;s location. Value is set in the distance key of the response. Defaults to 0 [0,1] (optional)
     * @param postaladdress Returns address inside the postaladdress key, that is specifically formatted for each country. Currently supported for addresses in Germany. Defaults to 0 [0,1] (optional)
     * @return ApiResponse&lt;Location&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request has been made from an unauthorized domain. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No location or places were found for the given input </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request exceeded the rate-limits set on your account </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Location> reverseWithHttpInfo(BigDecimal lat, BigDecimal lon, String format, Integer normalizecity, Integer addressdetails, String acceptLanguage, Integer namedetails, Integer extratags, Integer statecode, Integer showdistance, Integer postaladdress) throws ApiException {
        okhttp3.Call localVarCall = reverseValidateBeforeCall(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags, statecode, showdistance, postaladdress, null);
        Type localVarReturnType = new TypeToken<Location>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Reverse Geocoding (asynchronously)
     * Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.
     * @param lat Latitude of the location to generate an address for. (required)
     * @param lon Longitude of the location to generate an address for. (required)
     * @param format Format to geocode. Only JSON supported for SDKs (required)
     * @param normalizecity Normalizes village to city level data to city (required)
     * @param addressdetails Include a breakdown of the address into elements. Defaults to 1. (optional, default to 1)
     * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
     * @param namedetails Include a list of alternative names in the results. These may include language variants, references, operator and brand. (optional)
     * @param extratags Include additional information in the result if available, e.g. wikipedia link, opening hours. (optional)
     * @param statecode Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0 (optional)
     * @param showdistance Returns the straight line distance (meters) between the input location and the result&#39;s location. Value is set in the distance key of the response. Defaults to 0 [0,1] (optional)
     * @param postaladdress Returns address inside the postaladdress key, that is specifically formatted for each country. Currently supported for addresses in Germany. Defaults to 0 [0,1] (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request has been made from an unauthorized domain. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No location or places were found for the given input </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request exceeded the rate-limits set on your account </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reverseAsync(BigDecimal lat, BigDecimal lon, String format, Integer normalizecity, Integer addressdetails, String acceptLanguage, Integer namedetails, Integer extratags, Integer statecode, Integer showdistance, Integer postaladdress, final ApiCallback<Location> _callback) throws ApiException {

        okhttp3.Call localVarCall = reverseValidateBeforeCall(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags, statecode, showdistance, postaladdress, _callback);
        Type localVarReturnType = new TypeToken<Location>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
