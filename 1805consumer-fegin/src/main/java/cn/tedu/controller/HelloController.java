package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.tedu.feign.EurekaServiceFeign;

@RestController
public class HelloController {

	@Autowired
	private EurekaServiceFeign eurekaServiceFeign;
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		String url ="http://provider-user:7900/hello/"+name;
		return  eurekaServiceFeign.hello(name);
	}
	
}
