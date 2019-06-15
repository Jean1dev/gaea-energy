/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import utils.Constantes;

/**
 *
 * @author jeanfernandes
 */
public class RestClientService {

    private final String url = Constantes.URL_API;
    private String PATH;

    public RestClientService(String PATH) {
        this.PATH = PATH;
    }

    public String get() throws IOException {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        HttpHost target = new HttpHost("localhost", 8090, "http");
        //httpclient.getConnectionManager().shutdown();
        //httpclient = new DefaultHttpClient();
        // specify the get request
        HttpGet getRequest = new HttpGet(PATH);

        System.out.println("executing request to " + target);

        HttpResponse httpResponse = httpclient.execute(target, getRequest);
        HttpEntity entity = httpResponse.getEntity();

        System.out.println("----------------------------------------");
        System.out.println(httpResponse.getStatusLine());
        Header[] headers = httpResponse.getAllHeaders();
        for (int i = 0; i < headers.length; i++) {
            System.out.println(headers[i]);
        }
        System.out.println("----------------------------------------");
        String result = EntityUtils.toString(entity);
        if (entity != null) {
            System.out.println(result);
        }
        httpclient.getConnectionManager().shutdown();
        return result;
    }

    @Deprecated
    public String get_() {
        String apiOutput = "";
        DefaultHttpClient httpclient = new DefaultHttpClient();
        try {
            HttpHost target = new HttpHost("localhost", 8090, "http");
            HttpGet getRequest = new HttpGet(PATH);
            getRequest.addHeader("accept", "application/xml");

            HttpResponse response = httpclient.execute(target, getRequest);
            HttpEntity entity = response.getEntity();
            int statusCode = response.getStatusLine().getStatusCode();

            apiOutput = EntityUtils.toString(entity);

            //Lets see what we got from API
            //System.out.println(apiOutput);
        } catch (IOException ex) {
            Logger.getLogger(RestClientService.class.getName()).log(Level.SEVERE, null, ex);
        }
        httpclient.getConnectionManager().shutdown();
        return apiOutput;
    }

    public void post(String jsonParans) {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(url + PATH);

        HttpEntity stringEntity = new StringEntity(jsonParans, ContentType.APPLICATION_JSON);
        httpPost.setEntity(stringEntity);
        try {
            CloseableHttpResponse response2 = httpclient.execute(httpPost);
        } catch (IOException ex) {
            Logger.getLogger(RestClientService.class.getName()).log(Level.SEVERE, null, ex);
        }
        httpclient.getConnectionManager().shutdown();
    }

}
