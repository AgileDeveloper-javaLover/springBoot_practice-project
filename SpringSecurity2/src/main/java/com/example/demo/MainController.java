package com.example.demo;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

	@GetMapping("/")
	public String getIndex3() {
		return "<h1>welcome all</h1>";
	}

	@GetMapping("/user")
	public String getIndex() {
		return "<h1>welcome user</h1>";
	}

	@GetMapping("/admin")
	public String getIndex1() {
		return "<h1>welcome admin</h1><form action=\"/post\" method=\"Post\">"
				+ "		<input type=\"submit\">" + "	</form>";
	}

	@PostMapping("/pos")
	public String getIndex2() {
		return "<h1>welcome in post</h1>";
	}
}
