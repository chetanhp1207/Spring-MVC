package springmvc1.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Excep {

	@GetMapping("/optn")
	@ResponseBody
	public Object opt() {

		int a = 100;
		int b = 5;
		int res = a / b;
		System.out.println(res);
		return "The result is: " + res;

	}

	@GetMapping("/optn1")
	@ResponseBody
	public Object opt1() {

		int a = 1000;
		int b = 0;
		int res = a / b;
		System.out.println(res);
		return "The result will be " + res;

	}

	@ExceptionHandler(exception = ArithmeticException.class)
	@ResponseBody
	public String Handlegetdata(ArithmeticException ae) {

		return "Invalid Operation";
	}

}
