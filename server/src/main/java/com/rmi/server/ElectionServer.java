package com.election.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import com.rmi.middleware.*;
import com.rmi.server.*;
import com.rmi.client.*;

/**
 * Runs the server application.
 *
 * @param String[] args     the command arguments.
 * @catch RemoteException   if 'args' contains no context element.
 */
@SpringBootApplication
class ElectionServer {

  static void main(String[] args) {
    SpringApplication.run(ElectionServer, args);
    if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
    try {
      VoteList aVoteList = new VoteListServant();
      // Export the object stub.
      VoteList stub = (VoteList) UnicastRemoteObject.exportObject(aVoteList, 0);
      Registry registry = LocateRegistry.getRegistry();
      // Set the string to use in order to lookup the remote class.
      // registry.rebind('VoteList', stub);
      // Catch
    } catch (RemoteException e) {
			System.err.println("VoteListServer: m�todo main " + e.getMessage());
			e.printStackTrace();
    }
  }

}
