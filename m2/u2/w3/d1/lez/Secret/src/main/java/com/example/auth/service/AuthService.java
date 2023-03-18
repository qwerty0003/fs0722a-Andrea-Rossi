package com.example.auth.service;

import com.example.auth.payload.LoginDto;
import com.example.auth.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
