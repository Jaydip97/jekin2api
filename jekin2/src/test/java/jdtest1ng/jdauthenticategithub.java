package jdtest1ng;



import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restapibase.RequestClass;
import com.utility.Auth;
import com.utility.CreateURL;
import com.utility.FileCreate;
import com.utility.commonFunction;
import com.utility.createfile;
import com.utility.playloadCoverting;

import io.restassured.response.Response;
import resources.pojoclasses.createRepopojo;



public class jdauthenticategithub {

	public static String sha;
	public static ObjectMapper objectmapper;
	 @Test(priority=1)
	 public static void  listrepolanguage() {
		  String endpoint = CreateURL.getBaseUri("/repos/Jaydip97/seleniumeframework/languages");
			 String bearer_token= Auth.getToken();
			 Response response;
			response=RequestClass.GetRequest(endpoint, bearer_token);
			String responsebody=response.getBody().asString();
			System.out.println(responsebody);
			Assert.assertEquals(commonFunction.getResponseStatus(response), 200);
			int x=commonFunction.getResponseStatus(response);
			System.out.println(x);
		}
	
	   
}

