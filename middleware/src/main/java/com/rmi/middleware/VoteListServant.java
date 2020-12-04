package com.election.middleware;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

/**
 * VoteListServant.
 *
 * @class VoteServant
 * @param String candidateId      the version of the candidate id.
 * @param Vector<Vote> voteList   the candidate vote list.
 */
public class VoteListServant extends UnicastRemoteObject implements Vote {

  /* javalint-disable-next-line PrivateFieldCouldBeFinal */
  private Vector<Vote> voteList;

  public VoteListServant() throws RemoteException {
    voteList = new Vector<Vote>()
  }

  public Vote newVote(Vote v) throws RemoteException {
    Vote s = new VoteServant(getId, candidateId)
    voteList.addElement(s)
    return s
  }

  public Vector<Vote> allVotes() throws RemoteException {
    return voteList
  }

}
