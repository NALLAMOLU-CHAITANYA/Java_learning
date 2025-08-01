package com.chaitanya.service;

import org.springframework.web.bind.annotation.RequestParam;

public class AddService {
   public int add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
	   return i+j;
   }
}
