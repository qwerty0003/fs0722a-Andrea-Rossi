package com.example.configs;

import org.springframework.context.annotation.Configuration;

import jakarta.persistence.AttributeConverter;

@Configuration
public class SecretConverter implements AttributeConverter<String, String> {

	Character[] arr = {'C','M','P','Q','L','R','O','E','X','U'};
	
	@Override
	public String convertToDatabaseColumn(String attribute) {

		String res = "";

		if (attribute == null)
			return res;

		for (char c : attribute.toCharArray()) {
			String sc = c + "";
			int num = Integer.parseInt(sc);
			res += arr[num];
		}

		return res;
	}

	@Override
	public String convertToEntityAttribute(String dbData) {

		String res = "";

		if (dbData == null)
			return res;

		for (char c : dbData.toCharArray()) {
			
			
			for (int i = 0; i < arr.length;i++) {
				if(arr[i].equals(c)) {
					res += i;
				}
			}
			
		}

		return res;
	}

}
