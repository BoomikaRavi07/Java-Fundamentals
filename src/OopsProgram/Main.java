package OopsProgram;
import java.util.ArrayList;
import JavaTest.api.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<Response> arrResponse = new ArrayList<>();
		Response response = new Response();
		response.setName("Boomika");
		response.setId(1);
		
		Response response1 = new Response(2, "Ashwini");
		
		arrResponse.add(response);
		arrResponse.add(response1);
		arrResponse.add(new Response(3, "Akshaya"));
		arrResponse.add(1, new Response(5,"Ash" ));
		
		arrResponse.forEach(res -> {
			System.out.println("id : "+res.getId()+"  name: "+res.getName());
		});
		
	}

}