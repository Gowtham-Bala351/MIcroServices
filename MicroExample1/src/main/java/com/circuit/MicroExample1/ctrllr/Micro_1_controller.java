package com.circuit.MicroExample1.ctrllr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Micro_1_controller {
	@GetMapping("/getmicro1")
	public String getMicro()
	{
		return "MicroServices_1";
	}
}
