/*
This file is part of PircBot.
This software is licensed under GNU General Public License (GPL)
version 2 or (at your option) any later version.
*/

package org.jibble.pircbot;

/**
 * A NickAlreadyInUseException class.  This exception is
 * thrown when the PircBot attempts to join an IRC server
 * with a user name that is already in use.
 */
public class NickAlreadyInUseException extends IrcException {

    private static final long serialVersionUID = 2582903613603823587L;

    /**
     * Constructs a new IrcException.
     *
     * @param e The error message to report.
     */
    public NickAlreadyInUseException(String e) {
        super(e);
    }
    
}
