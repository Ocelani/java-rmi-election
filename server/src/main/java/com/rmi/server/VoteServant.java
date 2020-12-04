package com.election.server;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

import com.rmi.middleware.*;
import com.rmi.server.*;
import com.rmi.client.*;

/**
 * VoteServant.
 *
 * @class VoteServant
 * @param String candidateName    the vote candidate name.
 * @param String id               the vote id.
 */
@SpringBootApplication
@ComponentScan("com.election")
public class VoteServant extends UnicastRemoteObject implements Vote {

  String id;
  int candidateId;

  public VoteServant(String id, String candidateName) throws RemoteException {
		theId = id;
		myCandidate = candidateName;
	}

  public String getId() throws RemoteException {
    return theId;
  }

  public int getCandidateName() throws RemoteException {
    return myCandidate;
  }


}
