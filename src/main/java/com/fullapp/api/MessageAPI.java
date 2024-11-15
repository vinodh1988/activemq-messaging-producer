package com.fullapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fullapp.messaging.MessageSender;

@RestController
@RequestMapping("/api/message")
public class MessageAPI {
	@Autowired
	   private MessageSender sender;

	@GetMapping("")
	public ResponseEntity<String> addMessage(@RequestParam String message) {
		sender.send(message);
		return new ResponseEntity<String>("Success",HttpStatus.OK);
	}
}
