package dev.fatma.userservicetestfinal.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;

@Component
public class SecretClass {
    @Value("${secretkey}")
    String key;
}
