package com.pairprogramming.friendlyurl;

/**
 * Created by binita on 07/03/15.
 * The goal of this exercise is to use TDD to write a method/methods that can generate search engine friendly URL slugs such as "aunt-millies-and-co-inc" from strings such as "Aunt Millie's & Co., Inc" so you can build URL's like:

 http://dining.com/restaurants/aunt-millies-and-co-inc

 Use TDD to work through adding more cases to see how the interviewee works with string manipulation and regex's
 Discuss string capitalization... is the URI case sensitive and should you downcase the slugs or retain case?
 Discuss SEO, is there a difference between http://foo.com?p1=x&p2=y and http://foo.com?p2=y&p1=x and why?
 Discuss how the candidate has built search engine friendly URL's in the framework they usually use
 */
public interface FriendlyURL {

     String textToUrlPath(String text);
}
