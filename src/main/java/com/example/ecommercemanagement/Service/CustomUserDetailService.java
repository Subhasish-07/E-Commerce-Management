package com.example.ecommercemanagement.Service;

import com.example.ecommercemanagement.Model.CustomUserDetail;
import com.example.ecommercemanagement.Model.User;
import com.example.ecommercemanagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user=userRepository.findUserByEmail(email);
        if (user.isEmpty()){
            throw new UsernameNotFoundException("User name not found!!");
        }else{
            return new CustomUserDetail(user.get());
        }
    }
}
