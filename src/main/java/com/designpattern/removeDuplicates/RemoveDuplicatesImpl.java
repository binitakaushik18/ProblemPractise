package com.designpattern.removeDuplicates;

import org.apache.commons.lang.StringUtils;
import org.mockito.internal.util.collections.Sets;

import java.util.*;

/**
 * Created by binita on 26/02/15.
 */
public class RemoveDuplicatesImpl implements RemoveDuplicates {
    @Override
    public String removeDuplicates(String param) {
        List<Character> characterList = null;
        if(StringUtils.isNotEmpty(param))
        {

            characterList = new ArrayList<>();
            for(int i=0;i<param.toCharArray().length;i++) {

                if(!characterList.contains(param.charAt(i))) {

                    characterList.add((Character) param.charAt(i));
                }
            }
        }
        else{
            throw new EmptyStackException();
        }
        Iterator iterator = characterList.iterator();
        StringBuilder duplicateRemoved = new StringBuilder();
        while(iterator.hasNext()){
            duplicateRemoved.append(iterator.next());
        }
        return duplicateRemoved.toString();
    }
}
