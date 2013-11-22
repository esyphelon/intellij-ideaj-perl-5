package com.perllanguage;

import com.intellij.lang.Language;
/**
 * Created by daniel on 11/22/13.
 */
public class PerlLanguage extends Language {
    public static final PerlLanguage INSTANCE = new PerlLanguage();

    private PerlLanguage() {
        super("Perl");
    }
}
