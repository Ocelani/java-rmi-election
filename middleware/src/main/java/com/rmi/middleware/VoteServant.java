package com.election.middleware;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

/**
 * VoteServant.
 *
 * @class VoteServant
 * @param String candidateName    the vote candidate name.
 * @param String id               the vote id.
 */
@SuppressWarnings('serial')
public class VoteServant extends UnicastRemoteObject implements Vote {

  String id;
  int candidateId;

  public VoteServant(String id, String candidateName) throws RemoteException {
		theId = id;
		myCandidate = candidateName;
	}

  public String getId() throws RemoteException {
    return theId
  }

  public int getCandidateName() throws RemoteException {
    return myCandidate
  }


}
