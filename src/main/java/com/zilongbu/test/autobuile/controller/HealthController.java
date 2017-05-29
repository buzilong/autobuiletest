package com.zilongbu.test.autobuile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller handling health check request.
 *
 */
@RestController
public class HealthController {

	private static final String HEALTH_MESSAGE = "OK";

	/**
	 * /_health.
	 * 
	 * @return
	 */
	@GetMapping("/_health")
	public String health() {
		return HEALTH_MESSAGE;
	}

	/**
	 * /.
	 * 
	 * @return
	 */
	@GetMapping("/")
	public String hello() {
		return HEALTH_MESSAGE;
	}

}
