package cn.tedu.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//跟提供者关联
@FeignClient(value="provider-user")
public interface EurekaServiceFeign {

	@RequestMapping("/hello/{name}")
	//请求的变量名也需要血泉
	public String hello(@PathVariable("name") String name);
	
}
