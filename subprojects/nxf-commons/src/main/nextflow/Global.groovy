/*
 * Copyright (c) 2013-2014, Centre for Genomic Regulation (CRG).
 * Copyright (c) 2013-2014, Paolo Di Tommaso and the respective authors.
 *
 *   This file is part of 'Nextflow'.
 *
 *   Nextflow is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Nextflow is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Nextflow.  If not, see <http://www.gnu.org/licenses/>.
 */

package nextflow

import groovy.transform.CompileStatic

/**
 * Hold global variables
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@CompileStatic
class Global {

    /**
     * The pipeline session instance
     */
    static private session

    /**
     * The main configuration object
     */
    static private Map config

    /**
     * @return The object instance representing the current session
     */
    static <T> T getSession() {
        (T)session
    }

    /**
     * Set the application session object
     *
     * @param value An object instance representing the current session
     */
    static <T> void setSession( value ) {
        session = value
    }

    /**
     * @return A {@link Map} instance representing the application configuration
     */
    static Map getConfig() {
        config
    }

    /**
     * Define the application wide-configuration object
     *
     * @param value An instance of {@link Map} holding the configuration properties
     */
    static void setConfig( Map value ) {
        config = value
    }
}
