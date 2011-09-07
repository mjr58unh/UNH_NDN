package org.dummy;

import edu.unh.ndn.info.AuthorService;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: mjr58
 * Date: 9/6/11
 * Time: 10:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class MikeTest {


    private static AuthorService author = AuthorService.getInstance();

    @Test
    public void FindKenAsAuthor() {
    	assertNotNull (author.getAuthorName("Ken"));
    }
}
