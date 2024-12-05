package com.ramazanayyildiz.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ramazanayyildiz.model.Employee;

@Configuration
public class AppConfig {

	@Bean
	public  List<Employee> employeeList(){//DB bağlanmadan örnek veriler kullanımı db bağlantısı yapılınca kaldırılacak!!!
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1","Ramazan","Ayyıldız"));
		employeeList.add(new Employee("2","Ümit","Memiş"));
		employeeList.add(new Employee("3","Yakup","Yetiş"));
		employeeList.add(new Employee("4","Hakkı Nevzat Can","Çelik"));
		employeeList.add(new Employee("5","İsmail Cem","Uzun"));
		employeeList.add(new Employee("6","Umut Can","Yetim"));
		
		return employeeList;
		
	}
}
