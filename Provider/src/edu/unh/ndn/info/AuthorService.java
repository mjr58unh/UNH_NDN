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

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;


public class AuthorService {

    private static AuthorService service;
    private ServiceLoader<Author> loader;


    /**
     * Creates a new instance of AuthorService
     */
    private AuthorService() {
        loader = ServiceLoader.load(Author.class);
    }

    /**
     * Retrieve the singleton static instance of AuthorService.
     */
    public static synchronized AuthorService getInstance() {
        if (service == null) {
            service = new AuthorService();
        }
        return service;
    }

    /**
     * Retrieve the name from the first author provider
     */
    public Iterator<Author> getAuthorIterator() throws ServiceConfigurationError {
        try {
            return loader.iterator();
/*
 *             while (author == null && authors.hasNext()) {

            	Author d = authors.next();
                author = d.getAuthor();
                System.out.println ("Author="+ author );
            }
 */
        } catch (ServiceConfigurationError serviceError) {
        	throw (serviceError);
        }
     }
    
    /**
     * Retrieve the first author name
     */
    public String getFirstAuthorName() {
    	String author = null;
    	
        try {
            Iterator<Author> authors = loader.iterator();
            while (author == null && authors.hasNext()) {
            	Author d = authors.next();
                author = d.getAuthor();
            }
        } catch (ServiceConfigurationError serviceError) {
            serviceError.printStackTrace();
        }
        return author;
    }
    
    /**
     * Retrieve a specific author
     */
    public String getAuthorName(String name) {
    	String author = null;
    	
        try {
            Iterator<Author> authors = loader.iterator();
            while (author == null && authors.hasNext()) {
            	Author d = authors.next();
                if (name.compareTo(d.getAuthor()) == 0)
                	author = d.getAuthor();
            }
        } catch (ServiceConfigurationError serviceError) {
            serviceError.printStackTrace();
        }
        return author;
    }
}