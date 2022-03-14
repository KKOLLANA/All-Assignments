package com.cg.spring.hello;




	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class SpringHello {
		
		@RequestMapping("/hello")
		public String sayHi() {
			return "hi";
		}

		
		
	}

