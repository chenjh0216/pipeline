package org.pathogen.bio.jni;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface PythonLib extends Library {

    PythonLib lib = Native.load("py/main.cpython-35m-x86_64-linux-gnu.so", PythonLib.class);

    int sum(int a, int b);

}
