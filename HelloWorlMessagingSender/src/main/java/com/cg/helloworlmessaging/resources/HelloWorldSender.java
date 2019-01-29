/**
 * 
 */
package com.cg.helloworlmessaging.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.helloworlmessaging.sender.Sender;

/**
 * @author ugawari
 *
 */
@RestController
@RequestMapping("/hellos")
public class HelloWorldSender {

	@Autowired
	private Sender sender;

	@GetMapping
	public void msg() {
		sender.send("Hello World");
		//return "Ujwala"; 
	}
}
