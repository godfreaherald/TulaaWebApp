package com.amzi.dao;



import org.springframework.web.client.RestTemplate;


/*
 * Uses Spring RestTemplate to access the Spring Rest Services
 */
public class TulaaServicewebapp {

public static final String REST_SERVICE_URI ="http://localhost:8080/TulaaEngineeringQtnsRestService";
	


	
	  /* Testing ValidParenthesis API---------- */
		public static String isValidParenthesis(String s){
			String result ="";
			
		RestTemplate restTemplate = new RestTemplate();
		result = restTemplate.getForObject(REST_SERVICE_URI+"/"+s, String.class);
        return result;
	}
	       /*Testing PythagoreanTriplet API----------*/
	public static String hasPythagoreanTriplet(String aar){
                 String result ="";
		
         		RestTemplate restTemplate = new RestTemplate();
         		result = restTemplate.getForObject(REST_SERVICE_URI+"/array/"+aar, String.class);
                 return result;
	
       
	}
	
}



