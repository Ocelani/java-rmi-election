package com.election.middleware;

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
