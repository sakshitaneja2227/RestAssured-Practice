package restAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestClass {

	@Test
	public void basicUrlLaunch() {

		Response res = given().contentType("application/json")
				.get("http://vma-wm-bc-0304:13180/coba/entity/v1/Country/IN").then().extract().response();

		String strRes = res.asString();

		System.out.println("res.contentType()  : " + res.contentType());
		System.out.println("strRes  : " + strRes);

		System.out.println(res.path("name"));
		System.out.println(res.path("validFor.startDateTime"));
	}

}
