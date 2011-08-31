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

import edu.unh.ndn.info.Author;

/* 
 * Create a default author
 */

public class DefaultAuthor implements Author {
	
	private String authorName;
	
	public DefaultAuthor() {
		authorName = new String("Default");
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return authorName;
	}

}
