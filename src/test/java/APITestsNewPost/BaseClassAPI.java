package APITestsNewPost;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.*;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.*;
import org.junit.jupiter.api.BeforeEach;
import io.restassured.builder.ResponseBuilder;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.security.KeyStore;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class BaseClassAPI {
    protected RequestSpecification requestSpecification;
    protected ResponseSpecification responseSpecification;

    @BeforeEach
    public void setSpecs(){
        requestSpecification = new RequestSpecBuilder()
                .log(LogDetail.ALL)
                .setBaseUri("https://api.novaposhta.ua/v2.0/json/")
                .setContentType(ContentType.JSON)
                .build();
        responseSpecification = new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }


}
