package com.rmi.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import com.rmi.middleware.*;
import com.rmi.server.*;
import com.rmi.client.*;

/**
 * @class ClientApplication
 */
@SpringBootApplication
@RestController
class ClientApplication {

  @Autowired
  @Lazy
  private Environment environment;

  @Value("${rmi.host}")
  private String rmiHost;

  @Value("${rmi.port}")
  private Integer rmiPort;

  @Bean
  RmiProxyFactoryBean rmiVoteProxy() {
    RmiProxyFactoryBean bean = new RmiProxyFactoryBean()
    bean.setServiceInterface(Vote.class)
    bean.setServiceUrl('rmi://' + rmiHost + ':' + rmiPort + '/' + Vote.class.getId() + Vote.class.getCandidateId())
    return bean
  }

  public static void main(String[] args) {
    try {
      ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(ClientApplication.class, args)
      Vote vote = configurableApplicationContext.getBean(Vote.class)

      System.out.println('================== Client Side ==================')
      System.out.println('elector-name: ' + vote.getName('electorName').toString())
      System.out.println('candidate-id: ' + vote.getCandidateId('candidateId').toString())
      System.out.println('vote-computed: ' + voteList.newVote('newVote').toString())
      System.out.println('Resultados: ' + voteList.allVotes().toString());

    }catch (RemoteException e) {
			System.out.println("M�todo allShapes: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Lookup: " + e.getMessage());
		}
  }

}
