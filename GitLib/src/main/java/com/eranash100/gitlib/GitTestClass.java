package com.eranash100.gitlib;

public class GitTestClass
{

    public GitTestClass(Listener listener)
    {
        listener.onCreate();
    }

    private interface Listener
    {
        void onCreate();
    }
}
