package com.teaparty;

/**
 * Created by binita on 05/03/15.
 * Create a class (TeaParty) with the following interface:
 String welcome(String lastName, boolean isWoman, boolean isSir);
 The welcome messages follow the pattern: Hello {title} {lastName}.
 {title} has the following rules:
 Ms. for a woman
 Sir for a knight
 Mr. otherwise

 */
public interface TeaParty {
    String welcome(String lastName, boolean isWoman, boolean isSir);

}
