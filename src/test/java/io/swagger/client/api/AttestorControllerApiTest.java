/*
 * MCP Root CA Service
 * Service for maintaining a list of root CAs
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@maritimeconnectivity.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Attestor;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttestorControllerApi
 */
@Ignore
public class AttestorControllerApiTest {

    private final AttestorControllerApi api = new AttestorControllerApi();

    /**
     * createAttestor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAttestorUsingPOSTTest() throws ApiException {
        String body = null;
        Attestor response = api.createAttestorUsingPOST(body);

        // TODO: test validations
    }
    /**
     * getAttestor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttestorUsingGETTest() throws ApiException {
        Long id = null;
        Attestor response = api.getAttestorUsingGET(id);

        // TODO: test validations
    }
    /**
     * getAttestors
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttestorsUsingGETTest() throws ApiException {
        List<Attestor> response = api.getAttestorsUsingGET();

        // TODO: test validations
    }
}
