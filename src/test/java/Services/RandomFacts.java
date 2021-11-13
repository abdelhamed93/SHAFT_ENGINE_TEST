package Services;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.shaft.api.RestActions;

import ServicesBase.CatFacts;

public class RandomFacts {

	CatFacts cat = new CatFacts();
	String text_content;

	// API Level - check if the text in response body is empty or not.

	@Test
	public void checkIsTextEmpty() {

		text_content = RestActions.getResponseJSONValue(cat.randomCatFact(), "text");
		Assert.assertNotNull(text_content, "Text is Empty");

	}

}
