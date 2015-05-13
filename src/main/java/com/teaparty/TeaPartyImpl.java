package com.teaparty;

import org.apache.commons.lang.StringUtils;

/**
 * Created by binita on 05/03/15.
 */
public class TeaPartyImpl implements TeaParty {

    @Override
    public String welcome(String lastName, boolean isWoman, boolean isSir) {
        StringBuilder builder = new StringBuilder("Hello ");

        if(StringUtils.isBlank(lastName)) {
            return builder.append("Mr. otherwise").toString();
        }
            if (isWoman && !isSir) {
                builder.append("Ms. " + lastName);
            } else if (isSir && !isWoman) {
                builder.append("Mr. " + lastName);
            }
            else {
                builder.append("Mr. otherwise");
            }

        return builder.toString();

    }
}
