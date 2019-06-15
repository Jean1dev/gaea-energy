/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author jeanfernandes
 */
import java.io.IOException;
import model.Produto;
import org.apache.http.*;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * A simple Java REST GET example using the Apache HTTP library. This executes a
 * call against the Yahoo Weather API service, which is actually an RSS service
 * (http://developer.yahoo.com/weather/).
 *
 * Try this Twitter API URL for another example (it returns JSON results):
 * http://search.twitter.com/search.json?q=%40apple (see this url for more
 * twitter info: https://dev.twitter.com/docs/using-search)
 *
 * Apache HttpClient: http://hc.apache.org/httpclient-3.x/
 *
 */
public class TestRestClient {

    public static void main(String[] args) throws IOException {
        RestClientService rest = new RestClientService("/produtos");
        //String teste = rest.get();
        //System.out.println("oe");
        ProdutoService p = new ProdutoService();
        //p.getByID(1);
        //p.getAll();
        p.post(new Produto(null, "vai porra", 2.45));
    }
    
    public void testGEtProduto(){
        
    }
    
    public void teste(){
        
        DefaultHttpClient httpclient = new DefaultHttpClient();
        try {

            //CloseableHttpClient _httpclient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost("http://localhost:8090/produtos");
            String JSON_STRING = "{\n"
                    + "    \"id\": \"\",\n"
                    + "    \"nome\": \"teste\",\n"
                    + "    \"preco\": 2.30\n"
                    + "}";
            HttpEntity stringEntity = new StringEntity(JSON_STRING, ContentType.APPLICATION_JSON);
            httpPost.setEntity(stringEntity);
            CloseableHttpResponse response2 = httpclient.execute(httpPost);
            // specify the host, protocol, and port
            HttpHost target = new HttpHost("localhost", 8090, "http");
            httpclient.getConnectionManager().shutdown();
            httpclient = new DefaultHttpClient();
            // specify the get request
            HttpGet getRequest = new HttpGet("/produtos");

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

            if (entity != null) {
                System.out.println(EntityUtils.toString(entity));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // When HttpClient instance is no longer needed,
            // shut down the connection manager to ensure
            // immediate deallocation of all system resources
            httpclient.getConnectionManager().shutdown();
        }

    }
}
