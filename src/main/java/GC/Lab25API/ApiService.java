package GC.Lab25API;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import GC.Lab25API.model.Data;
import GC.Lab25API.model.Forecast;


	@Service
	public class ApiService {

		private RestTemplate rt;// parse JSon data and store in object

		// initialization block that runs when a new instance of the class is created
		// loaded before the constructor
		{
			ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
				request.getHeaders().add(HttpHeaders.USER_AGENT, "anything");
				return execution.execute(request, body);
			};
			rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
		}

		
		public Data readText(Double latitude, Double longitude){
			
			//1. Specify URL
			String url="https://forecast.weather.gov/MapClick.php?lat={latitude}&lon={longitude}&FcstType=json";
			
			//2. Call the API
			Forecast forecast=rt.getForObject(url,Forecast.class,latitude,longitude);
			
			// return certain parts of JSon response
			return forecast.getData();

		
		
		
	}
	
	  }
