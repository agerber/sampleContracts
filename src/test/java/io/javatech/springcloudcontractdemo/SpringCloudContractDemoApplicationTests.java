package io.javatech.springcloudcontractdemo;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public abstract class SpringCloudContractDemoApplicationTests {

	@Autowired
	WebApplicationContext webApplicationContext;

	@Before
	public void setup() {
		RestAssuredMockMvc.webAppContextSetup(this.webApplicationContext);
	}
}
