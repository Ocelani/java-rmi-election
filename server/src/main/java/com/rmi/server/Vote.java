package com.election.server;

import com.rmi.middleware.*;
import com.rmi.server.*;
import com.rmi.client.*;

/**
 * Vote.
 *
 * @interface Vote
 * @param String candidateName    the vote candidate name.
 * @param Int id               the vote id.
 */
interface Vote extends Remote {

  String getId();

  int getCandidateId();

}
