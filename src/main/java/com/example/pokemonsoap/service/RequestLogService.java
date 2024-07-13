package com.example.pokemonsoap.service;

import com.example.pokemonsoap.model.RequestLog;
import com.example.pokemonsoap.repository.RequestLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RequestLogService {

    @Autowired
    private RequestLogRepository requestLogRepository;

    public void logRequest(String ip, String methodName) {
        RequestLog log = new RequestLog();
        log.setIp(ip);
        log.setRequestDate(LocalDateTime.now());
        log.setMethodName(methodName);
        requestLogRepository.save(log);
    }
}
