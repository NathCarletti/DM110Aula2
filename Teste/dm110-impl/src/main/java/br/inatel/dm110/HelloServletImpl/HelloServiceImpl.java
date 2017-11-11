package br.inatel.dm110.HelloServletImpl;

import br.inatel.dm110.hello.api.HelloService;
import br.inatel.dm110.hello.api.Results;

public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello(String name) {
		return "<h1>Hello " + name + "!!</h1>";
	}
	
	@Override
	public Results message(String first, String last) {
		Results result = new Results();
		result.setFirstName(first);
		result.setLastName(last);
		String message = String.format("Hello %s %s", first, last);
		result.setMessage(message);
		return result;
	}

}
