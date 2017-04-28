
package com.aps0.tools;

import java.io.File;
import java.io.IOException;

public class InputFromFile implements Input {
    
    public InputFromFile (String fileName) throws IOException {
        file = new File(fileName);
        if ( ! file.exists() ) {
            throw new IOException("fichier absent " + fileName);
        }
    }
    public InputFromFile (File file) {
        this.file = file;
    }
    private final File file;

    @Override
	public String getText() throws IOException {
        final String content = FileTool.slurpFile(file);
        return content;
    }
}
