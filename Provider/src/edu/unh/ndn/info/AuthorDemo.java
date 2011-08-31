/*
 * Copyright (C) 2011 UNH CS880 Secure Development Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.unh.ndn.info;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.ServiceConfigurationError;

/*
 * Shows all possible providers
 */

public class AuthorDemo {


    /*
     *  End of variables declaration
     */
    private AuthorService author;
    
    /*
     * Show all possible providers
     */
    public AuthorDemo() {
        author = AuthorService.getInstance();
    	try {
        	Iterator<Author> authors = author.getAuthorIterator();
            while (authors.hasNext()) {
                System.out.println("Author=" + authors.next().getAuthor() );
            }
     	}
    	catch (ServiceConfigurationError error) {
            System.out.println("ServiceConfigurationError" );
    	}
    }

    /**
	 * @param no runtime arguments used
	 */
	public static void main(String[] args) {
		new AuthorDemo();
	}

}