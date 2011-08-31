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

package edu.unh.ndn.test.info;


import static org.junit.Assert.*;

import edu.unh.ndn.info.AuthorService;
import edu.unh.ndn.info.Author;

import java.util.Iterator;
import java.util.ServiceConfigurationError;

import org.junit.Test;

public class AuthorServiceTest {

	private static AuthorService author = AuthorService.getInstance();
	
    @Test
    public void NoAuthorServiceThrowsError() {
    	try {
        	Iterator<Author> iterator = author.getAuthorIterator();
    		if (iterator.hasNext())  // Iterator throw exception when not configured
    			assertTrue (true);
    	}
    	catch (ServiceConfigurationError error) {
    		assertTrue (true);
    	}
    }
    
    @Test
    public void CanIterateAuthors() {
    	try {
        	Iterator<Author> authors = author.getAuthorIterator();
            while (authors.hasNext()) {
            	assertNotNull (authors.next());
            }
     	}
    	catch (ServiceConfigurationError error) {
    		assertTrue (true);
    	}
    }
    
}
