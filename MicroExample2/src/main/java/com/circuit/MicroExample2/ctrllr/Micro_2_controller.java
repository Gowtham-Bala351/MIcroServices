package com.circuit.MicroExample2.ctrllr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Micro_2_controller {
	@GetMapping("/getmicro2")
	public String getMicro()
	{
		return "MicroServices_2 fall_back";
	}
}
