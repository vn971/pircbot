/* 
This file is part of PircBot.
This software is licensed under GNU General Public License (GPL)
version 2 or (at your option) any later version.
*/

package org.jibble.pircbot;

/**
 * An IrcException class.
 *
 * @since   0.9
 * @author  Paul James Mutton,
 *          <a href="http://www.jibble.org/">http://www.jibble.org/</a>
 * @version    1.5.0 (Build time: Mon Dec 14 20:07:17 2009)
 */
public class IrcException extends Exception {

    private static final long serialVersionUID = 5804312990557341368L;

    /**
     * Constructs a new IrcException.
     *
     * @param e The error message to report.
     */
    public IrcException(String e) {
        super(e);
    }
    
}
