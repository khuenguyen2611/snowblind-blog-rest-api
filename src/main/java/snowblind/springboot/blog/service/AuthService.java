package snowblind.springboot.blog.service;

import snowblind.springboot.blog.payload.LoginDto;
import snowblind.springboot.blog.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
