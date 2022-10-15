package org.pathogen.bio;


import com.sun.jna.Native;
import org.pathogen.bio.jni.PythonLib;

public class Main {



    public static void main(String[] args) {
        PythonLib pythonLib = PythonLib.lib;
        System.out.println(pythonLib.sum(1,2));
        System.out.println("Hello world!");
    }
}