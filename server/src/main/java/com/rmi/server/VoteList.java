package com.election.server;

import com.rmi.middleware.*;
import com.rmi.server.*;
import com.rmi.client.*;

/**
 * VoteList.
 *
 * @interface Vote
 */
interface VoteList extends Remote {

  Vote newVote(String candidateName) throws RemoteException;

  Vector<Vote> allVotes() throws RemoteException;

  String getCandidateVersion() throws RemoteException;

}
