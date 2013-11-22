package com.perllanguage;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.encoding.EncodingManager;
import java.nio.charset.Charset;
/**
 * Created by daniel on 11/22/13.
 */
public class PerlFileType extends LanguageFileType {
    public static final LanguageFileType INSTANCE = new PerlFileType();
    @NonNls public static final String DEFAULT_EXTENSION = "pl";
    @NonNls public static final String DOT_DEFAULT_EXTENSION = "."+DEFAULT_EXTENSION;

    PerlFileType() {
        super(PerlLanguage.INSTANCE);
    }

    @Override
    @NotNull
    public String getName() {
        return "com/perllanguage";
    }

    @Override
    @NotNull
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    @NotNull
    public String getDescription() {
        return "";
    }

    @Override
    public javax.swing.Icon getIcon() {
        return PerlIcon.FILE;
    }

    @Override
    public String getCharset(@NotNull VirtualFile file, final byte[] content) {
        Charset charset = EncodingManager.getInstance().getDefaultCharsetForPropertiesFiles(file);
        return charset == null ? CharsetToolkit.getDefaultSystemCharset().name() : charset.name();
    }
}
