package org.opendatamesh.platform.git.client;

import org.opendatamesh.platform.git.client.exceptions.ClientException;
import org.opendatamesh.platform.git.client.http.HttpEntity;
import org.opendatamesh.platform.git.client.http.HttpMethod;

import java.util.Map;

interface RestUtilsTemplate {

    <T> T exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType, Object... uriVariables) throws ClientException;

    <T> T exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType, Map<String, ?> uriVariables) throws ClientException;

}
