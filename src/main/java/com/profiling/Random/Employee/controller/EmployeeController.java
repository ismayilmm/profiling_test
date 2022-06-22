package com.profiling.Random.Employee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@RequestMapping("/getname")
	public String getEmployee() {
		return "Наш ИИ проанализировал ваш запрос и на работу нужно брать некоего Маммедли Исмаила Ибрагим оглы";
	}
	@RequestMapping("/getanecdote")
	public String getAnecdote() {
		return "Имя Ибрагим вам о чем нибудь говорит?";
	}
	@RequestMapping("/youtube")
	public String getAnecdote() {
		return "https://youtube.com/";
	}
}
