package ServicesBase;

import com.shaft.api.RestActions;
import com.shaft.api.RestActions.RequestType;
import com.shaft.driver.DriverFactory;

import io.restassured.response.Response;

public class CatFacts {

	RestActions apiObject;
	Response data;
	public static final String baseUrl = System.getProperty("base_url");
	public String end_point = "/facts/random";

	/*
	 * returns Response Body of Random cat fact, Arguments are optional in this
	 * method Because they are default values.
	 */

	public Response randomCatFact() {
		RestActions apiObject = DriverFactory.getAPIDriver(baseUrl);
		data = apiObject.buildNewRequest(end_point, RequestType.GET).setUrlArguments("animal_type=cat&amount=1")
				.performRequest();
		return data;
	}
}
