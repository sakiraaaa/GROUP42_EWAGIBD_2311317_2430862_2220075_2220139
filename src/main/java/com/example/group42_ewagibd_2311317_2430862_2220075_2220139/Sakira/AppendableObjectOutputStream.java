package com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);

    }
    @Override
    protected void writeStreamHeader(){

    }

}
