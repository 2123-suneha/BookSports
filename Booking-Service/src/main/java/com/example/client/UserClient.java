package com.example.client;

import org.apache.catalina.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="USER-SERVICE")
public interface UserClient {
	@GetMapping("/getUserDetailsbyUserId/{userId}")
	User getUserDetailsbyUserId(@PathVariable int userId);
}
 