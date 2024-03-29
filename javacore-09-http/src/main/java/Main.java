import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static final String REMOTE_SERVICE_URL = "https://jsonplaceholder.typicode.com/posts";
    public static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setUserAgent("My Test Service")
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();


        // Создание объекта запроса с произвольными заголовками
        HttpGet requset = new HttpGet(REMOTE_SERVICE_URL);
        requset.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());

        // Отправка запроса
        CloseableHttpResponse response = httpClient.execute(requset);

        // Вывод полученных заголовков
        Arrays.stream(response.getAllHeaders()).forEach(System.out::println);

//        // Чтение тела ответа
//        String body = new String(response.getEntity().getContent().readAllBytes(), StandardCharsets.UTF_8);
//        System.out.println(body);

        List<Post> posts = mapper.readValue(
                response.getEntity().getContent(),
                new TypeReference<>() {
                }
        );
        posts.forEach(System.out::println);

        response.close();
        httpClient.close();
    }
}
