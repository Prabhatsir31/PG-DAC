package DEVE;

import Cli.*;

public class VotingNotAllowedException extends Exception {
    public VotingNotAllowedException(String message) {
        super(message);
    }
}